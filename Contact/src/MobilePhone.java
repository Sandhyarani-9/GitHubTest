import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Programmer> myContacts;

    //constructor
    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Programmer>();
    }

    public boolean addNewContact(Programmer programmer) {
        if (findContact(programmer.getName()) >= 0) {
            System.out.println("The contact is already saved.");
            return false;
        }
        myContacts.add(programmer);
        return true;
    }

    private int findContact(Programmer programmer) {
        return this.myContacts.indexOf(programmer);
    }

    // Overload of the method findContact, ie you use the same method with different parameters
    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            Programmer programmer = this.myContacts.get(i);
            if (programmer.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public void printContacts() {
        System.out.println("Contact list: ");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + " ." +
                    this.myContacts.get(i).getName() + " --> " +
                    this.myContacts.get(i).getPhoneNumber() + " programming language : " +
                    this.myContacts.get(i).getLanguage() + " database manager : " +
                    this.myContacts.get(i).getDatabase());
        }
    }

}
