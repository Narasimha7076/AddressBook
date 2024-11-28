import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    List<Contact> adBook = new ArrayList<>();

    public void addContact(Contact c1){
        adBook.add(c1);
        System.out.println("Contact is added");
    }

    public void display(){
        System.out.println(adBook);
    }

    public  void createContact() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter last name");
        String lname = sc.next();
        System.out.println("Enter city");
        String city = sc.next();
        System.out.println("Enter state");
        String state = sc.next();
        System.out.println("Enter email");
        String email = sc.next();
        System.out.println("Enter phone num");
        int phone = sc.nextInt();
        System.out.println("Enter zip");
        int zip = sc.nextInt();

        Contact c1 = new Contact(name,lname,city,state,email,phone,zip);
        adBook.add(c1);

    }
}
