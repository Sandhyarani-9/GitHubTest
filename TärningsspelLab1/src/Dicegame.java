import java.util.Scanner;
public class Dicegame {
    public static void main(String[] args) {

        int userPlayer;
        int computerPlayer;

        int computerScore = 0;
        int userScore = 0;
        int totalScore = 0;
        Scanner scan=new Scanner(System.in);

        System.out.println("Velkommn to the dice game! ");
        System.out.println("Enter the number for throws");

        int n=scan.nextInt();
        int userTotal = 0;
        int computerTotal = 0;
        for (int turn = 1; turn <= n; turn++) {
            computerPlayer = (int) (Math.random() * 6);
            computerScore = computerPlayer+ 1;
            computerTotal+=computerScore;

            userPlayer = (int) (Math.random() * 6);
            userScore = userPlayer+1;
            userTotal+=userScore;
            //totalScore = computerScore + userScore;
            System.out.println("\nThrow "+turn);
            //System.out.println("sum of both players: " + totalScore);

            System.out.println("UserScore: "+ userScore);
            System.out.println("ComputerScore: "+ computerScore);
            //System.out.println();
            if(turn>=2){
                System.out.println("Total scores\nUser: "+	userTotal+"\nComputer: " + computerTotal);
            }

            if (computerPlayer > userPlayer) {
                computerScore += 1;
                // System.out.println("ComputerPlayer Score." + computerScore);
                // break;
            } else if (userPlayer > computerPlayer) {
                userScore += 1;
                //  System.out.println("UserPlayer Score." + userScore);
                // break;
            } else {
                System.out.println("Turn is a tie");
                //break;

            }

        }

        if (computerTotal > userTotal) {
            System.out.println("\ncomputerPlayer won the game, " + computerScore + " out of " + n + ".");
        } else if (userTotal > computerTotal) {
            System.out.println("\nuserPlayer won the game, " + userScore + " out of " + n + ".");
        } else {
            System.out.println("\nIt is tie with computer winning " + computerScore + " user winning with " + userScore);
        }
    }
}