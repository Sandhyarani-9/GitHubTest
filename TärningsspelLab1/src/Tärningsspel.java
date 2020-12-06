import java.util.Scanner;
public class Tärningsspel {
    public static void main(String[] args) {

        int userPlayer; // player for the game
        int computerPlayer;

        int userScore = 0;  //scores for the players
        int computerScore = 0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Velkommn to the dice game! ");
        System.out.println("Enter the number for throws");

        int n=scan.nextInt();    // n is for number of times to roll the die
        int u1,u2,u3,u4,u5,c1,c2,c3,c4,c5,userTotal = 0,computerTotal = 0;
        for (int turn = 1; turn <= n; turn++) {  //loop for continuous the process until our enterd no. of turns gets over
            System.out.println("\nThrow "+turn);
            u1=getRandom();             //Each die roll chance
            u2=getRandom();             //User die and computer die
            u3=getRandom();
            u4=getRandom();
            u5=getRandom();
            c1=getRandom();
            c2=getRandom();
            c3=getRandom();
            c4=getRandom();
            c5=getRandom();
            computerPlayer=c1+c2+c3+c4+c5;          //total random computer dice score
            computerTotal+=computerPlayer;          //added to the computerTotal
            userPlayer=u1+u2+u3+u4+u5;
            userTotal+=userPlayer;

            System.out.println("\t\t\tDice1\tdice2\tDice3\tdice4\tDice5\tTotal");
            System.out.println("UserScore:\t\t "+ u1 + "\t\t"+u2+"\t\t"+u3+"\t\t"+u4+"\t\t"+u5+"\t\t"+userPlayer);
            System.out.println("ComputerScore:\t"+  c1 + "\t\t"+c2+"\t\t"+c3+"\t\t"+c4+"\t\t"+c5+"\t\t"+computerPlayer);
            //System.out.println();
            if(turn>=2){
                System.out.println("Total scores\tUser: "+	userTotal+"\tComputer: " + computerTotal);
            }
            if (computerPlayer > userPlayer) {
                computerScore += 1;
                System.out.println("Computer Score: " + computerScore+"\tUser Score: " + userScore);

            } else if (userPlayer > computerPlayer) {
                userScore += 1;
                System.out.println("Computer Score: " + computerScore+"\tUser Score: " + userScore);

            } else {
                System.out.println("Turn is a tie");

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
    public static int getRandom(){
        int x= (int)(Math.random() * 6);
        return x+1;
    }
}