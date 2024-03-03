package contact;

import java.util.HashMap;
import java.util.Map;

class ContactService {
    private Map<String, Contact> contacts;

    public ContactService() {
        contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        contacts.put(contact.getId(), contact);
    	
    }

    public void deleteContact(String contactId) {
        contacts.remove(contactId);
    }
    
    public void updateFirstName(String contactId, String newFirstName) {
    	Contact contact = contacts.get(contactId);
    	if (contact != null) {
    		contact.setFirstName(newFirstName);
    	}
    }
    
    public void updateLastName(String contactId, String newLastName) {
    	Contact contact = contacts.get(contactId);
    	if (contact != null) {
    		contact.setLastName(newLastName);
    	}
    }
    
    public void updatePhone(String contactId, String newPhone) {
    	Contact contact = contacts.get(contactId);
    	if (contact != null) {
    		contact.setPhone(newPhone);
    	}
    }
    
    public void updateAddress(String contactId, String newAddress) {
    	Contact contact = contacts.get(contactId);
    	if (contact != null) {
    		contact.setAddress(newAddress);
    	}
    }


    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}