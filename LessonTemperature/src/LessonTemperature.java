import java.util.Scanner;

public class LessonTemperature{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Vill du ha Celsius eller Fahrenheit ? ");
        String temperature=scan.nextLine();

        if(temperature.equals("Celsius")) {
            System.out.println("Vad är temperature? ");

            int celsius = scan.nextInt();
            int fahrenheit;
            fahrenheit = celsius * 9 / 5 + 32;
        
            System.out.println("Dina temperature i fahrenheit är : " + fahrenheit);
        }
        else if(temperature.equals("Fahrenheit")) {
            System.out.println("Vad är temperature? ");
            int celsius;
            int fahrenheit = scan.nextInt();
            celsius = (fahrenheit - 32) * 5 / 9;

            System.out.println("Dina temperature i celsius är : " + celsius);
        }
        else{
            System.out.println("Error");


        }


    }

}
