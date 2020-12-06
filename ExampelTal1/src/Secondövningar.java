import java.util.Scanner;
public class Secondövningar {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a  integer: ");
        int n = s.nextInt();
        s.nextLine(); //consume the rest of the line
for(int i=0;i<n;i++)
        System.out.println("Java är kul!");
       // String text = s.nextLine();
    }
}