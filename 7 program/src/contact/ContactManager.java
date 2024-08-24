package contact;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContactManager {
    private Set<Contact> contactSet = new HashSet<>();
    private Map<String, Contact> contactMap = new HashMap<>();

    public void addContact(Contact contact) {
        contactSet.add(contact);
        contactMap.put(contact.getName(), contact);
    }

    public Contact getContactByName(String name) {
        return contactMap.get(name);
    }

    public Set<Contact> getAllContacts() {
        return contactSet;
    }
}
