import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class YtahzyeeGame {

    private final Integer SIZE=5;
    Random rand = new Random();
    Scanner keyboard = new Scanner(System.in);

    public void startGame() {

        int[] dice = new int[SIZE];
        rollDice(dice);
        printDice(dice);


        System.out.println("Do you want to reroll any dice ? " + "Y/N");
        String answer = keyboard.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            rollDice(dice);
        } else if (answer.equalsIgnoreCase("n")) {
            calculateSum(dice);
        } else {
            System.out.println("Wrong command!");
        }
    }

    public int[] rollDice(int[] dice) {
        for (int i = 0; i < dice.length; i++) {
            dice[i] = (int) (Math.random() * 6);
        }
       // System.out.println("Your dice after re roll :" + Arrays.toString(dice));
        return dice;

    }

    public int[] rerollDice(int[] dice) {
        System.out.println("What dice do you want to reroll? dice from 0-4");
        int diceToReroll = keyboard.nextInt();

        return dice;
        //diceToReroll=(int)(Math.random()*6);
        // Replace the numbers at the index the user specifies with new random numbers and return the array.
    }

    public void printDice(int[] dice) {
        System.out.println("Your dice show : " + Arrays.toString(dice));
    }

    public void calculateSum(int[] dice) {
        int sum = 0;
        for (int i : dice) {// for(int i=0;i<5;i++){
            sum += i;
        }
        if (sum == 30) {
            System.out.println("YAHTZEE! Your total score is 50! Congratulations!");
        } else
            System.out.println("Your total score is: " + sum);
    }

    public static void main(String[] args) {
        new YtahzyeeGame().startGame();
    }
}
