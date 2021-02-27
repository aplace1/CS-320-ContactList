import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    private final ContactService service = new ContactService();
    private final Contact testContact = new Contact("00a01", "person1fn", "person1ln", "0005550000",
            "1 test_address rd.");

    @Test
    @DisplayName("List<Contact> is not null")
    void testGetContacts() {
        Assertions.assertNotNull(service.getContactList());
    }

    @Test
    @DisplayName("Operation (REMOVE) contact")
    void testRemoveContact() {
        service.add(testContact);
        Assertions.assertEquals(1, service.getContactList().size());
        service.remove("00a01");
        Assertions.assertEquals(0, service.getContactList().size());
    }

    @Test
    @DisplayName("Operation (ADD) contact")
    void testAddContact() {
        service.add(testContact);
        Assertions.assertEquals(1, service.getContactList().size());
    }

    @Test
    @DisplayName("Operation (UPDATE) contact")
    void testUpdateContact() {
        service.add(testContact);
        service.update("00a01", "changed", "changed", "0000111000", "testchangeaddress");
        Assertions.assertNotEquals("person1fn", testContact.getFirstName());
        Assertions.assertNotEquals("person1ln", testContact.getLastName());
        Assertions.assertNotEquals("0005550000", testContact.getPhone());
        Assertions.assertNotEquals("1 test_address rd.", testContact.getAddress());
    }
}