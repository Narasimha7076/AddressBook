import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        AddressBook a1 = new AddressBook();
        int i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to address book");
        do {
            System.out.println("Enter 1 to create contact\nEnter 2 to display all contacts\nEnter 3 to edit contact");
            int inp = sc.nextInt();
            switch (inp){
                case 1 -> a1.createContact();
                case 2 -> a1.display();
                case 3-> {
                    System.out.println("Enter First name to edit");
                    String fname = sc.next();
                    a1.editContact(fname);
                }
                default -> System.out.println("enter valid input");
            }
            System.out.println("press 0 to exit");
            i = sc.nextInt();
        }while(i!=0);
    }


}