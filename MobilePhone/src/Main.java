//import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    private static Scanner scan=new Scanner(System.in);
    //Creating an instant with a default Number
    private static MobilePhone mobilePhone=new MobilePhone();

    public static void main(String[] args) {

        /*  1.Create a program that implements a simple mobile phone with following capabilities
            2.Able to store,modify,remove and query contact names.
            3.You will want to create a seperate class for Contacts name and phone number).
            4.The MobilePhone class has the functionality listed above.
            5.Add a menu of options that are available.
            6.Options: Quit, print list of contacts , add new contact , update existing contact ,
                remove contact , search/find contact.
  (boolean) 7.When adding or updating be sure to check if the contact already exists(use name)
            8.Be sure not to expose the inner workings of the ArryList to mobilePhone
	            ----->  examples no ints, no .get(i) etc...
            9.MobilePhone should do everything with Contact objects only. */

        boolean quit=false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\n Enter action: (6 to show available actions)");
            int action=scan.nextInt();
            scan.nextLine();

            switch (action){
                case 0:
                    System.out.println("\n shutting down....");
                    quit=true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                   break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name=scan.nextLine();
        System.out.println("Enter phone number : ");
        String phone=scan.nextLine();
        //Contact newContact=new Contact(name,phone);
        Contact newContact=Contact.createContact(name,phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New contact added: name = " +name + " phone = " +phone);
        }
        else{
            System.out.println("Cannot add, " +name+ "already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name : ");
        String name = scan.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("contact not found.");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scan.nextLine();
        System.out.println("Enter new phone number : ");
        String newNumber = scan.nextLine();
        //Contact newContact= new Contact(newName,newNumber);
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record.");
        } else {
            System.out.println("Error updating record.");
        }
    }
    private static void removeContact() {
        System.out.println("Enter existing contact name : ");
        String name = scan.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("contact not found.");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted.");
        }
        else{
            System.out.println("Error deleting contact.");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name : ");
        String name = scan.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("contact not found.");
            return;
        }
        System.out.println("Name: " +existingContactRecord.getName()+ " Phone number is " +existingContactRecord.getPhoneNumber());

    }


    private static void startPhone(){
        System.out.println("Starting phone....");
    }
    private static void printActions(){
        System.out.println("\nAvailable actions : \nPress");
        System.out.println("0 - to shutdown");
        System.out.println("1 - to print contacts");
        System.out.println("2 - to add new contacts");
        System.out.println("3 - to update existing contact in existing contacts");
        System.out.println("4 - to remove contact from existing contacts");
        System.out.println("5 - query if an existing contacts exists");
        System.out.println("6 - to show all available actions.");
        System.out.println("Choose your action ");

    }
}
