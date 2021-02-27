class Contact {

    // Variable declarations
    private final String ID;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    /**
     * Default Constructor for Contact Class
     *
     * @param ID        as contact's unique identifier
     * @param firstName as contact's first name
     * @param lastName  as contact's last name
     * @param phone     as contact's phone number
     * @param address   as contact's address
     * @throws IllegalArgumentException if parameters are null or too long.
     */
    public Contact(String ID, String firstName, String lastName, String phone, String address) {

        // Check parameters against specifications before assignment.
        if (ID == null || ID.length() > 10) throw new IllegalArgumentException("Invalid argument: ID");
        if (firstName == null || firstName.length() > 10) throw new IllegalArgumentException("Invalid argument: firstName");
        if (lastName == null || lastName.length() > 10) throw new IllegalArgumentException("Invalid argument: lastName");
        if (phone == null || phone.length() != 10) throw new IllegalArgumentException("Invalid argument: phone");
        if (address == null || address.length() > 30) throw new IllegalArgumentException("Invalid argument: address");

        // Parameter testing succeeded, assign values
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.ID = ID;
    }

    /**
     * Getter for ID
     *
     * @return String as ID
     */
    public String getID() {
        return (ID);
    }

    /**
     * Getter for firstName
     *
     * @return String as firstName
     */
    public String getFirstName() {
        return (firstName);
    }

    /**
     * Getter for lastName
     *
     * @return String as lastName
     */
    public String getLastName() {
        return (lastName);
    }

    /**
     * Getter for phone
     *
     * @return String as phone
     */
    public String getPhone() {
        return (phone);
    }

    /**
     * Getter for address
     *
     * @return String as address
     */
    public String getAddress() {
        return (address);
    }

    /**
     * Setter for firstName
     *
     * @param firstName as firstName
     * @throws IllegalArgumentException if null or length is greater than 10
     *                                  characters
     */
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) throw new IllegalArgumentException("Invalid argument: address");
        this.firstName = firstName;
    }

    /**
     * Setter for lastName
     *
     * @param lastName as lastName
     * @throws IllegalArgumentException if null or length is greater than 10
     *                                  characters
     */
    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) throw new IllegalArgumentException("Invalid argument: address");
        this.lastName = lastName;
    }

    /**
     * Setter for phone
     *
     * @param phone as phone
     * @throws IllegalArgumentException if null or length is not equal to 10
     *                                  characters
     */
    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10) throw new IllegalArgumentException("Invalid argument: phone-number");
        this.phone = phone;
    }

    /**
     * Setter for address
     *
     * @param address as address
     * @throws IllegalArgumentException if null or length is greater than 30
     *                                  characters
     */
    public void setAddress(String address) {
        if (address == null || address.length() > 30) throw new IllegalArgumentException("Invalid argument: address");
        this.address = address;
    }
}