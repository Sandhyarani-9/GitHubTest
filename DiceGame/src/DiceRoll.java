import java.util.ArrayList;
import java.util.Scanner;

public class DiceRoll {

    public static void main(String[] args) {

        int numplayers = 0, numdice = 0; // incrementers for #rolls and #players


        //  ArrayList<ArrayList> players = new ArrayList<ArrayList>();
        //   players.add(rolls);  /// adding list to a list
        //  System.out.println(players);

        ArrayList<Integer> rolls = new ArrayList<>();

        System.out.println("Enter the number of players.");
        Scanner scan = new Scanner(System.in);
        numplayers = scan.nextInt();

        System.out.println("Enter the number of dice.");
        numdice = scan.nextInt();
    }
}
