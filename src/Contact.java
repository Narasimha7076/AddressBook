public class Contact {
    String firstname;
    String lastName;
    String city;
    String state;
    String email;
    int phone;
    int zip;




    public Contact(String city, String firstname, String lastName, String state, String email, int phone, int zip) {
        this.city = city;
        this.firstname = firstname;
        this.lastName = lastName;
        this.state = state;
        this.email = email;
        this.phone = phone;
        this.zip = zip;
    }
}
