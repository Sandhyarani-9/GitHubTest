import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter name of person: ");
        String name=scan.nextLine();

        System.out.println("Enter person email : ");
        String email=scan.nextLine();

        System.out.println("Enter proglanguage: ");
        String programmingLang = scan.nextLine();

        System.out.println("Enter database : ");
        String dataBase= scan.nextLine();

        System.out.println("Enter person phone number: ");
        Long phone= scan.nextLong();




       // Employees employees=new Employees(name,email,phone);
      //  employees.printData();
        //employees.salary();

        Programmers programmers=new Programmers(name,email,phone,programmingLang,dataBase);
        programmers.printData();
        programmers.salary();
    }
}
