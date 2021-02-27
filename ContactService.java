import java.util.LinkedList;

class ContactService {

    // LinkedList containing all contacts
    private final LinkedList<Contact> contactList;

    /**
     * Default Constructor for ContactService
     */
    public ContactService() {
        contactList = new LinkedList<>();
    }

    /**
     * Add a new contact to a list
     *
     * @param contact as new Contact object
     */
    public void add(Contact contact) {
        contactList.add(contact);
    }

    /**
     * Remove a contact from a list
     *
     * @param ID as contact ID
     */
    public void remove(String ID) {
        contactList.removeIf(contact -> contact.getID().equals(ID));
    }

    /**
     * Update contact information using a basic linear search
     *
     * @param ID        as contact's unique identifier
     * @param firstName as contact's first name
     * @param lastName  as contact's last name
     * @param phone     as contact's phone number
     * @param address   as contact's address
     */
    public void update(String ID, String firstName, String lastName, String phone, String address) {
        for (Contact target : contactList)
            if (target.getID().equals(ID)) {
                target.setFirstName(firstName);
                target.setLastName(lastName);
                target.setAddress(address);
                target.setPhone(phone);
                break;
            }
    }

    /**
     * @return contactList as a list of contacts
     */
    public LinkedList<Contact> getContactList() {
        return contactList;
    }
}