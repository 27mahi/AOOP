package contact;

public class Main {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        manager.addContact(new Contact("Alice", "123-456-7890"));
        manager.addContact(new Contact("Bob", "234-567-8901"));
        manager.addContact(new Contact("Charlie", "345-678-9012"));

        System.out.println("All Contacts:");
        manager.getAllContacts().forEach(System.out::println);

        System.out.println("Contact by Name:");
        System.out.println(manager.getContactByName("Bob"));
    }
}
