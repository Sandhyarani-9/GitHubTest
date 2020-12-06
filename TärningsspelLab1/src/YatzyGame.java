import java.util.Random;
import java.util.Scanner;
public class YatzyGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int s1, s2, s3, s4, s5;               //declaring the variables that will be used in the
        // selecting which dice to re-roll
        int rollPerTurn;                //declaring variable to keep track of rolls per turn
        int[] dice = new int[5];
        Random randomNumber = new Random();

        System.out.println("Velkommn till Yatzy game!");


        System.out.println("Enter User Player : ");
        String userPlayer = scan.nextLine();

        System.out.println("Enter Computer Player : ");
        String computerPlayer = scan.nextLine();
    }
}
      /*  int selection = scan.nextInt();

        if (selection == 1) {
            firstRoll();
          //  break;
        }
        else if (selection == 2) {
           // break;
        }

        while (rollPerTurn < 3) {
            System.out.println();
            s1 = scan.nextInt();//obtaining input to determine which dice to re-roll
            s2 = scan.nextInt();
            s3 = scan.nextInt();
            s4 = scan.nextInt();
            s5 = scan.nextInt();
            reRoll();
        }
    }

    public static int firstRoll() {
        for (int i = 0; i < dice.length; i++) {
            dice[i] = rollDice();
        }
        System.out.println("Select which dice to reroll.");
        for (int a = 0; a < dice.length; a++) {
            System.out.print(dice[a] + " ");
        }
        rollPerTurn = 1; //indicating this is the first roll
        return rollPerTurn;
    }

    public static int[] reRoll() //method to re-roll certain dice
    {
        if (s1 == 1) {
            dice[0] = rollDice(); //re-roll Die 1
        }
        if (s2 == 1) {
            dice[1] = rollDice(); //re-roll Die 2
        }
        if (s3 == 1) {
            dice[2] = rollDice(); //re-roll Die 3
        }
        if (s4 == 1) {
            dice[3] = rollDice(); //re-roll Die 4
        }
        if (s5 == 1) {
            dice[4] = rollDice(); //re-roll Die 5
        }
        rollPerTurn++;
        for (int b = 0; b < dice.length; b++) {
            System.out.print(dice[b] + " "); //displaying the dice after re-roll
        }
        return dice;
    }

    public static int rollDice() //method to roll a die
    {
        int die = 1 + randomNumber.nextInt(6);
        return die;
    }

}*/