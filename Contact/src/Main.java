import java.util.Scanner;

public class Main {
private static Scanner scan=new Scanner(System.in);
private static MobilePhone mobilePhone=new MobilePhone("552653");
    public static void main(String[] args) {

        boolean quit=false;
        startPhone();
        printActions();

    while(!quit){
        System.out.println("\n Select : (3 to display selections.");
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
                printActions();
                break;
        }
    }
 }
private static void addNewContact(){
    System.out.println("Enter name of your contact:  ");
    String name=scan.nextLine();
    System.out.println("Enter phone number for your contact: ");
    String phoneNumber=scan.nextLine();
    System.out.println("Enter programming language for your contact.");
    String language=scan.nextLine();
    System.out.println("Enter database for your contact: ");
    String database=scan.nextLine();

    Programmer newContact=new Programmer(name,phoneNumber,language,database);

    if(mobilePhone.addNewContact(newContact)){
        System.out.println("New contact added: name : " +name+ ", Telephone: " +phoneNumber);
        }
    else {
        System.out.println("Unale to add new contact , " +name+ " already exists.");
        }
    }

private static void startPhone(){
    System.out.println("Start telephone...");
}

private static void printActions(){
    System.out.println("\nChoose options: ");
    System.out.println("0 - stutting down ..");
    System.out.println("1 - show contacts ");
    System.out.println("2 - add new contact ");
    System.out.println("3 - view all list of options.");
}
}
