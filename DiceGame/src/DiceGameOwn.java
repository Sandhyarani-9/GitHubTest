import java.util.Random;
import java.util.Scanner;
public class DiceGameOwn {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Start the game for press : " + "Y/N");
String response=scan.nextLine();
        if(response.equalsIgnoreCase("y")) {
            System.out.println("Welcome to the dice game!");
            System.out.println("The game is played between 2 players ");
        }
        else{
            System.out.println("Thank you and Good bye!");
        }

        System.out.println("Enter player1 name : ");
        int player1=scan.nextInt();
        System.out.println("Enter player2 name : ");
        int player2=scan.nextInt();

        int numt,throwr;
        int p1sum=0;int p2sum=0;
        int dsum;
        int player;
        String press;
        int d1;
        int d2;
        int d3;
        int d4;
        int d5;

        System.out.println("The game will be played between player 1 and player 2");
        System.out.println("Enter number of throws for this game is : ");



int n=scan.nextInt();
        for(numt=1;numt<=n;numt++){
            System.out.println("count of throw is and first throw" +numt);
            for(int p=1;p<=2;p++){
                if(p==1){
                    System.out.println("Press t or T to throw the dice or o to exit");
                    press=scan.nextLine();
                    if(press.equalsIgnoreCase("t")) {
                        System.out.println("Throws will count");
                    }
                        else if(press.equalsIgnoreCase("o")){
                        System.out.println("Thank you and play again");
                        }
                        else{
                        System.out.println("Exit game");
                    }
                    d1=(int)(Math.random()*6);
                    d2=(int)(Math.random()*6);
                    d3=(int)(Math.random()*6);
                    d4=(int)(Math.random()*6);
                    d5=(int)(Math.random()*6);
                    System.out.println("d1:" + d1 + " d2:" + d2 + " d3:" + d3 + " d4:" + d4 + " d5:" + d5);
                    dsum=d1+d2+d3+d4+d5;
                    if(player1==1){
                        p1sum=+dsum;
                    }
                    else if(player2==2){
                        p2sum=+dsum;
                    }
                }
            }

        }
        System.out.println("Total score for player 1 is : " + p1sum);
        System.out.println("Total score for player 2 is : " + p2sum);
        if(p1sum>p2sum){
            System.out.println("Player 1 is winner.");
        }
        else if(p1sum<p2sum){
            System.out.println("Player 2 is winner.");
        }
        else if(p1sum==p2sum){
            System.out.println("Game is draw");
        }
        else{
            System.out.println("Thank you and play again");
        }

    }
}
