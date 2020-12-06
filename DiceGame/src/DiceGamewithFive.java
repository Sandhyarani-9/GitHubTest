import java.util.Random;
import java.util.Scanner;
public class DiceGamewithFive {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Start the game for press : " + "Y/N");
        String response = scan.nextLine();
        if (response.equalsIgnoreCase("y")) {
            System.out.println("Welcome to the dice game!");
            System.out.println("The game is played between 2 players ");
            System.out.println("Press enter to start");
        } else if (response.equalsIgnoreCase("n")) {
            System.out.println("Thank you and Good bye!");
        } else {
            System.out.println("Exit");
        }
        int numt;
        int p1sum = 0;
        int p2sum = 0;
        int dsum;
        String press;
        int d1, d2, d3, d4, d5;

        String player = scan.nextLine();

        System.out.println("Enter player1 name : ");
        String player1 = scan.nextLine();
        System.out.println("Enter player2 name : ");
        String player2 = scan.nextLine();

        System.out.println("The game will be played between player 1 and player 2");
        System.out.println("Enter number of throws for this game is : ");


        int n = scan.nextInt();
        for (numt = 1; numt <= n; numt++) {
            System.out.println("count of first throw : " + numt);
            for (int p = 1; p <= 2; p++) {    // p is for number of players.Here we used two players
                if (p == 1) {
                    System.out.println("Press t or T to throw the dice or o to exit");
                    press = scan.nextLine();
                    if (press.equalsIgnoreCase("t")) {
                        System.out.println("Throws will count");
                    } else if (press.equalsIgnoreCase("o")) {
                        System.out.println("Thank you and play again");
                    } else {
                        System.out.println("Exit game");
                    }

                    d1 = (int) (Math.random() * 6);
                    d2 = (int) (Math.random() * 6);
                    d3 = (int) (Math.random() * 6);
                    d4 = (int) (Math.random() * 6);
                    d5 = (int) (Math.random() * 6);
                    System.out.println("d1:" + d1 + " d2:" + d2 + " d3:" + d3 + " d4:" + d4 + " d5:" + d5);
                    dsum = d1 + d2 + d3 + d4 + d5;
                    if (player.equals(player1)) {
                        p1sum = +dsum;
                    } else if (player.equals(player2)) {
                        p2sum = +dsum;
                    }
                }


                System.out.println("Total score for " + player1 + "is :" + p1sum);
                System.out.println("Total score for " + player2 + "is :" + p2sum);
                if (p1sum > p2sum) {
                    System.out.println("Player 1 is winner.");
                } else if (p1sum < p2sum) {
                    System.out.println("Player 2 is winner.");
                } else if (p1sum == p2sum) {
                    System.out.println("Game is draw");
                } else {
                    System.out.println("Thank you and play again");
                }

            }
        }
    }
}
