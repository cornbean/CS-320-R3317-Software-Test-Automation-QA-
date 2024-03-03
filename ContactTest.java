package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {
	
    @Test
    public void testContactInitialization() {
        Contact contact = new Contact("12345", "First Name", "Last Name", "1234567890", "Address");

        assertEquals("12345", contact.getId());
        assertEquals("First Name", contact.getFirstName());
        assertEquals("Last Name", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("Address", contact.getAddress());
    }
    
	@Test
	void testContactIdLengthEquals10() {
		Contact contact = new Contact("1234567890", "First Name", "Last Name", "1234567890", "Address");
		assertEquals(contact.getId().length(), 10);

	}
	
	@Test
	void testContactIdLengthLessThan10() {
		Contact contact = new Contact("12345", "First Name", "Last Name", "1234567890", "Address");
		assertTrue(contact.getId().length() < 10);

	}
	
	@Test 
	void testContactIdLengthGreaterThan10() {
		assertThrows(IllegalArgumentException.class, 
				() -> {
					new Contact("123456789012345", "First Name", "Last Name", "1234567890", "Address");
				}
				);

	}
	
	@Test 
	void testContactIdIsNull() {
		assertThrows(IllegalArgumentException.class, 
				() -> {
					new Contact(null, "First Name", "Last Name", "1234567890", "Address");
				}
				);
	}
	
	

		@Test
		void testContactFirstNameLengthEquals10() {
			Contact contact = new Contact("12345", "First Name", "Last Name", "1234567890", "Address");
			assertEquals(contact.getFirstName().length(), 10);

		}
		
		@Test
		void testContactFirstNameLengthLessThan10() {
			Contact contact = new Contact("12345", "First Nam", "Last Name", "1234567890", "Address");
			assertTrue(contact.getFirstName().length() < 10);

		}
		
		@Test 
		void testContactFirstNameLengthGreaterThan10() {
			assertThrows(IllegalArgumentException.class, 
					() -> {
						new Contact("12345", "First Names", "Last Name", "1234567890", "Address");
					}
					);

		}
		
		@Test 
		void testContactFirstNameIsNull() {
			assertThrows(IllegalArgumentException.class, 
					() -> {
						new Contact("12345", null, "Last Name", "1234567890", "Address");
					}
					);

	}
		
		@Test
		void testContactLastNameLengthEquals10() {
			Contact contact = new Contact("12345", "First Name", "Last Names", "1234567890", "Address");
			assertEquals(contact.getLastName().length(), 10);

		}
		
		@Test
		void testContactLastNameLengthLessThan10() {
			Contact contact = new Contact("12345", "First Name", "Last Name", "1234567890", "Address");
			assertTrue(contact.getLastName().length() < 10);

		}
		
		@Test 
		void testContactLastNameLengthGreaterThan10() {
			assertThrows(IllegalArgumentException.class, 
					() -> {
						new Contact("12345", "First Name", "Last Namess", "1234567890", "Address");
					}
					);

		}
		
		@Test 
		void testContactLastNameIsNull() {
			assertThrows(IllegalArgumentException.class, 
					() -> {
						new Contact("12345", "First Name", null, "1234567890", "Address");
					}
					);
		}
		
		@Test
		void testContactPhoneLengthEquals10() {
			Contact contact = new Contact("12345", "First Name", "Last Name", "1234567890", "Address");
			assertEquals(contact.getPhone().length(), 10);

		}
		
		
		@Test 
		void testContactPhoneNotEqualTo10() {
			assertThrows(IllegalArgumentException.class, 
					() -> {
						new Contact("12345", "First Name", "Last Name", "123456789", "Address");
					}
					);

		}
		
		@Test 
		void testContactPhoneIsNull() {
			assertThrows(IllegalArgumentException.class, 
					() -> {
						new Contact("12345", "First Name", "Last Name", null, "Address");
					}
					);
		}
		
		@Test
		void testContactAddressLengthEquals30() {
			Contact contact = new Contact("12345", "First Name", "Last Name", "1234567890", "This is to get the address to ");
			assertEquals(contact.getAddress().length(), 30);

		}
		
		@Test
		void testContactAddressLengthLessThan30() {
			Contact contact = new Contact("12345", "First Name", "Last Name", "1234567890", "Address");
			assertTrue(contact.getAddress().length() < 30);

		}
		
		
		@Test 
		void testContactAddressLengthGreaterThan30() {
			assertThrows(IllegalArgumentException.class, 
					() -> {
						new Contact("12345", "First Name", "Last Name", "1234567890", "This is to get the address to more than 30 characters");
					}
					);

		}
		
		
		@Test 
		void testContactAddressIsNull() {
			assertThrows(IllegalArgumentException.class, 
					() -> {
						new Contact("12345", "First Name", "Last Name", "1234567890", null);
					}
					);
		}
		
}
