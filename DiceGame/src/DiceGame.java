import java.util.Scanner;

public class DiceGame {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of players: ");
        int players = scan.nextInt();

        String[] playerName = new String[players + 1];
        for (int i = 0; i < players; i++) {
            System.out.println("Player " + (i + 1) + " Please enter your name: ");
            playerName[i] = scan.next();
        }

        System.out.println("Velkommn to the dice game! ");
        int n=scan.nextInt();
        System.out.println("how many throws you want to play :"+n);
if(n!=0)
        {
         for(int j=0;j<=n;j++){
//playerName[i]=(int)(Math.random()*6)+1;
         }
        }


    }

}


