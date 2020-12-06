import java.util.ArrayList;

public class MobilePhone {
   // private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(){//String myNumber) {
        //this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    //Adding a new contact
    public boolean addNewContact(Contact contact) {
        //before adding a contact we are checking that its exit or not
        //find contact will return the integer number
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file.");
            return false;
        }
        // If not exist, then add our contact
        myContacts.add(contact);
        return true;
    }

    //update Contact by using set method
    //OldContact is searching for and newContact is for updating new contact...
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " , was not found.");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " ,was replaced with " + newContact.getName());
        return true;
    }

    //Remove Contact
    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " , was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " ,was deleted.");
        return true;
    }

    //Find Contact Position  // this findContact method for single string of our entered value
    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    //Find Contact Names .....and passing parameter of the name(String contactName).
    // this findContact method is for all values checking with our entered value.
    private int findContact(String contactName) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            // Creating another temporary object to hold the name and compare
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    // query Contact
    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {     //It calls the findContact(Contact contact) method
            return contact.getName();
        }
        return null;
    }


    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;

    }

    public void printContacts() {
        System.out.println("Contact list");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + " . " +
                    this.myContacts.get(i).getName() + " --> " +
                    this.myContacts.get(i).getPhoneNumber());

        }
    }
}

