import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        AddressBook a1 = new AddressBook();
        int i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to address book");
        do {
            System.out.println("Enter 1 to create contact");
            int inp = sc.nextInt();
            switch (inp){
                case 1 -> createContact(a1);
                default -> System.out.println("enter valid input");
            }
            System.out.println("press 0 to exit");
            i = sc.nextInt();
        }while(i!=0);
    }

    static void createContact(AddressBook a1) {
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
        a1.addContact(c1);

    }
}