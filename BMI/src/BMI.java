import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        double längd;
        double vikt;
        double BMI;

        System.out.println("Skriv dina längd i meters : ");
        längd=scan.nextDouble();

        System.out.println("Skriv dina vikt i kilo : ");
        vikt=scan.nextDouble();

        BMI=vikt/(längd*längd);
        System.out.println("Dina BMI är : " + BMI);

        if(BMI<19){
            System.out.println("Du är mager.");
        }
        else if(BMI>20&&BMI<24){
            System.out.println("Du är underviktig." );
        }
        else if(BMI==25){
            System.out.println("Du är Perfekt.");
        }
        else if(BMI>26&&BMI<30){
            System.out.println("Du är överviktig.");
        }
        else if(BMI>30){
            System.out.println("Du är fetma.");
        }
else{
    System.out.println("Någon Fel.");
        }

    }
}
