import java.util.Scanner;
public class ExampelDoguessinggame {
    public static void main(String[] args) {

        int guessNumber=(int)(1+Math.random()*10);

        Scanner scan=new Scanner(System.in);
        int inputNumber;
        do {
            System.out.println("Välj ett number mellan 1 och 10 : ");
            inputNumber = scan.nextInt();

            if (inputNumber < guessNumber) {
                System.out.println("Ditt number är för lågt,försök igen.");
            } else if (inputNumber > guessNumber) {
                System.out.println("Ditt number är för hågt,försök igen.");
            }
        }while(inputNumber!=guessNumber);

        System.out.println(guessNumber + " är rätt gissat.Du har vunnit!");
        }

    }

