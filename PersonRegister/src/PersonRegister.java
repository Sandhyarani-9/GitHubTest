import java.util.Scanner;

public class PersonRegister {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Enter name of person:");
        String inputNamn=scan.nextLine();

        System.out.println("Enter place of person: ");
        String inputPlace=scan.nextLine();

        System.out.println("Enter person age: ");
        int intputAge = scan.nextInt();

        System.out.println("Enter person num: ");
        Long inputPhone=scan.nextLong();


        Person person = new Person(inputNamn,inputPlace,intputAge,inputPhone);

        System.out.println();
        System.out.println(person.ShowPersonInfo(inputNamn));
        System.out.println();

        if ((person.getAge() < 18)) {
            System.out.println("Welcome!You are under 18 years old.");
        }
        else {
            System.out.println("You are above 18 years old.");
        }
       /* System.out.println("Enter new age of person: ");
        person.setAge(scan.nextInt());

        System.out.println("You new age: " +person.getAge());*/
    }
}

