import java.util.Scanner;

public class Model {
    private static Scanner scan=new Scanner(System.in);
    private static BookList bookList=new BookList();

    public static void main(String[] args) {
        boolean quit=false;
        startApp();
        printInstructions();
        while(!quit){
            System.out.println("\n Choose : (3 options to show choices.");
            int action=scan.nextInt();
            scan.nextLine();

            switch (action){
                case 0:
                    System.out.println("\n Closing app..");
                    quit=true;
                    break;
                case 1:
                    bookList.showBookInfo();
                    break;
                case 2:
                    addNewBook();
                    break;
                case 3:
                    printInstructions();
                    break;
            }
        }
    }
    private static void startApp(){
        System.out.println("Start app..");
    }
    private static void addNewBook(){
        System.out.println("Enter title of your book: ");
        String title=scan.nextLine();
        System.out.println("Enter author of your book: ");
        String author=scan.nextLine();
        System.out.println("Enter length for audioBook: ");
        int length=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter format for audioBook:");
        String format=scan.nextLine();

        AudioBook newBook= new AudioBook(title,author,length,format);
        if(bookList.addNewBook(newBook)){
            System.out.println("New book added.. \nTitle : " +title+ " \nauthor : " +author+ "\nLength of book in minutes: " +length+ " \nFormat : " +format);
        }
        else{
            System.out.println("Can not added. " +title + " already exists.");
        }
    }
    private static void printInstructions(){
        System.out.println("\n Choose : ");
        System.out.println("0 - Closing application.. ");
        System.out.println("1 - Show books in booklist");
        System.out.println("2 - add book to booklist ");
        System.out.println("3 - show list of all instructions ");
    }
}
