import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<Contact> adBook = new ArrayList<>();

    public void addContact(Contact c1) {
        adBook.add(c1);
        System.out.println("Contact is added.");
    }

    public void display() {
        if (adBook.isEmpty()) {
            System.out.println("Address Book is empty!");
        } else {
            for (Contact contact : adBook) {
                System.out.println(contact);
            }
        }
    }

    public void createContact() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name:");
        String name = sc.next();
        System.out.println("Enter last name:");
        String lname = sc.next();
        System.out.println("Enter city:");
        String city = sc.next();
        System.out.println("Enter state:");
        String state = sc.next();
        System.out.println("Enter email:");
        String email = sc.next();
        System.out.println("Enter phone number:");
        int phone = sc.nextInt();
        System.out.println("Enter zip:");
        int zip = sc.nextInt();

        Contact c1 = new Contact(name, lname, city, state, email, phone, zip);
        adBook.add(c1);
        System.out.println("Contact created successfully!");
    }

    public void editContact(String firstName) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;

        for (Contact contact : adBook) {
            if (contact.firstname.equalsIgnoreCase(firstName)) {
                found = true;

                System.out.println("Editing contact: " + contact);
                System.out.println("Enter new first name:");
                contact.firstname = sc.next();
                System.out.println("Enter new last name:");
                contact.lastName = sc.next();
                System.out.println("Enter new city:");
                contact.city = sc.next();
                System.out.println("Enter new state:");
                contact.state = sc.next();
                System.out.println("Enter new email:");
                contact.email = sc.next();
                System.out.println("Enter new phone number:");
                contact.phone = sc.nextInt();
                System.out.println("Enter new zip:");
                contact.zip = sc.nextInt();

                System.out.println("Contact updated successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("No contact found with the first name: " + firstName);
        }
    }

    public void deleteContact(String firstname){
        boolean found = false;
        for(Contact C : adBook){
            if(C.firstname.equalsIgnoreCase(firstname)){
                found = true;
                adBook.remove(C);
                System.out.println("Contact deleted successfully!");
                break;
            }
        }
        if(!found){
            System.out.println("Contact not found");
        }
    }
}
