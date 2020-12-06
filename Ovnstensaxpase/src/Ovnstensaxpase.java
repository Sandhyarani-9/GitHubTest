import java.util.Scanner;
public class Ovnstensaxpase {
    public static void main(String[] args) {
        String[] choices={"sten","sax","påse"};
        String playerChoice;
        boolean quit=false;

        System.out.println("Velkommen (q for quit)!");

        while(!quit){
            int computerRand=(int)(Math.random()*3);
            //System.out.println("Slump: " + computerRand);

            String computerChoice=choices[computerRand];
            //System.out.println("Datorns val/slump " + computerChoice);

            Scanner scan=new Scanner(System.in);
            System.out.println("Sten, sax eller påse ?");
            playerChoice=scan.nextLine().toLowerCase();

           // System.out.println("Datorn " + computerChoice);

        if(playerChoice.equals("q"))
        {
         quit = true;
        System.out.println("Nu stänger vi ner spelet.");
        }
            else if(playerChoice.equals(computerChoice))
            {
                 System.out.println("Det blev samma.");
            }
            else if(playerChoice.equals("sten"))
            {
                if(computerChoice.equals("sax")){
                     System.out.println("Du vann!");
                  }
                else
                     System.out.println("Datorn vann!");
            }
            else if(playerChoice.equals("påse"))
            {
                 if(computerChoice.equals("sten")){
                    System.out.println("Du vann!");
                 }
                 else
                    System.out.println("Datorn van!");
            }
            else if(playerChoice.equals("sax"))
            {
                 if(computerChoice.equals("påse")){
                    System.out.println("Du vann!");
             }
                 else
                    System.out.println("Datorn vann!");

             }
        else{
            System.out.println("Det blev något fel...");
            }
        }
    }
}
