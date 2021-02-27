import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class ContactTest {

    private final Contact testData = new Contact("aaaaaaa123", "firstname", "lastname", "1115551111",
            "25000 Maximum street Road Lane");

    private final String id = testData.getID();
    private final String lastname = testData.getLastName();
    private final String firstname = testData.getFirstName();
    private final String phone = testData.getPhone();
    private final String address = testData.getAddress();
    private final List<String> contactVariables = List.of(id, lastname, firstname, phone, address);

    @Test
    @DisplayName("Test for Null-Attributes")
    void test_NullAttributes() {
        Assertions.assertAll(() -> Assertions.assertNotNull(contactVariables));
    }

    @Test
    @DisplayName("Test size of class strings")
    void testSizes() {
        Assertions.assertAll(() -> Assertions.assertTrue(contactVariables.get(0).length() <= 10), // test id
                () -> Assertions.assertTrue(contactVariables.get(1).length() <= 10), // test firstname
                () -> Assertions.assertTrue(contactVariables.get(2).length() <= 10), // test lastname
                () -> Assertions.assertEquals(contactVariables.get(3).length(), 10), // test phone
                () -> Assertions.assertTrue(contactVariables.get(4).length() <= 30)); // test address
    }

    @Test
    @DisplayName("Test getID() method")
    void testGetID() {
        Assertions.assertEquals(id, testData.getID());
    }

    @Test
    @DisplayName("Test getFirstName() method")
    void testGetFirstName() {
        Assertions.assertEquals(firstname, testData.getFirstName());
    }

    @Test
    @DisplayName("Test getLastName() method")
    void testGetLastName() {
        Assertions.assertEquals(lastname, testData.getLastName());
    }

    @Test
    @DisplayName("Test getPhone() method")
    void testGetPhone() {
        Assertions.assertEquals(phone, testData.getPhone());
    }

    @Test
    @DisplayName("Test getAddress() method")
    void testGetAddress() {
        Assertions.assertEquals(address, testData.getAddress());
    }

    @Test
    @DisplayName("Test setFirstName() method")
    void testSetFirstName() {
        testData.setFirstName("changefn");
        Assertions.assertNotEquals(testData.getFirstName(), firstname);
        testData.setFirstName(firstname);
    }

    @Test
    @DisplayName("Test setAddress() method")
    void testSetAddress() {
        testData.setAddress("testing academy road");
        Assertions.assertNotEquals(testData.getAddress(), address);
        testData.setAddress(address);
    }

    @Test
    @DisplayName("Test setPhone() method")
    void testSetPhone() {
        testData.setPhone("2225552222");
        Assertions.assertNotEquals(testData.getPhone(), phone);
        testData.setPhone(phone);
    }

    @Test
    @DisplayName("Test setLastName() method")
    void testSetLastName() {
        testData.setLastName("changeln");
        Assertions.assertNotEquals(testData.getLastName(), lastname);
        testData.setLastName(lastname);
    }
}