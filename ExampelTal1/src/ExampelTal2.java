import java.util.Scanner;
public class ExampelTal2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
int tal1;
int tal2;
int summa;
System.out.print("Skriv tal1: ");
tal1=scan.nextInt();

System.out.print("Skriv tal2 : ");
tal2=scan.nextInt();

summa=tal1+tal2;
System.out.print("Summan är : " + summa);
    }
}
