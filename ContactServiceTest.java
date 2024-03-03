package contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
	private ContactService contactService;
	
	@BeforeEach
	public void setup() {
		contactService = new ContactService();
	}
	
	
	@Test
	public void addContactTest() {
		Contact contact = new Contact("1234567890", "Bob", "Smith", "1234567890", "123 Test Ave");
        contactService.addContact(contact);
        Contact retrievedContact = contactService.getContact("1234567890");
        assertEquals(contact, retrievedContact);
        assertNotNull(contact);
	}
	
    @Test
    public void testDeleteTask() {
        Contact contact = new Contact("1234567", "Bob", "Smith", "1234567890", "123 Test Ave");
        contactService.addContact(contact);
        contactService.deleteContact("1234567");

        assertNull(contactService.getContact("1234567"));
        
    }
    
    @Test
    public void testUpdateContactFirstName() {
        Contact contact = new Contact("1234567", "Bob", "Smith", "1234567890", "123 Test Ave");
        contactService.addContact(contact);
        contactService.updateFirstName("1234567", "New Contact First Name");

        assertEquals("New Contact First Name", contactService.getContact("1234567").getFirstName());
    }
    
    @Test
    public void testUpdateContactLastName() {
        Contact contact = new Contact("1234567", "Bob", "Smith", "1234567890", "123 Test Ave");
        contactService.addContact(contact);
        contactService.updateLastName("1234567", "New Contact Last Name");

        assertEquals("New Contact Last Name", contactService.getContact("1234567").getLastName());
    }

    @Test
    public void testUpdateContactPhone() {
        Contact contact = new Contact("1234567", "Bob", "Smith", "1234567890", "123 Test Ave");
        contactService.addContact(contact);
        contactService.updatePhone("1234567", "New Contact Phone Number");

        assertEquals("New Contact Phone Number", contactService.getContact("1234567").getPhone());
    }

    @Test
    public void testUpdateContactAddress() {
        Contact contact = new Contact("1234567", "Bob", "Smith", "1234567890", "123 Test Ave");
        contactService.addContact(contact);
        contactService.updateAddress("1234567", "New Contact Address");

        assertEquals("New Contact Address", contactService.getContact("1234567").getAddress());
    }


	
}