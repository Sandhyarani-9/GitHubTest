import java.util.Scanner;
public class ExampelArrayTidsMaskin1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //String[5];
        String[] musik={"Beatles ger ut Abbey Road!","Jimi Hendrix spelar på Woodstock!",
                "Frank Zappa spelar med Mothers i Göteborg!","Grateful Dead släpper Live Dead!",
                "Black Sabbath släpper Paranoid!"};
        String[] sport={"Fotbolls-VM!","Ishockey-VM","OS i London!","OS i Tokyo!","Formel 1 i New Delhi!"};

        String[] viktigt={"Val i USA!","Striden om almarna i Stockholm!",
        "Hagahuset ockuperas i Göteborg!","Norrmalmstorgsdramat i Stockholm!","Val i Sverige!"};

        //variables for no.of elements in the array
        System.out.println("Enter number: ");
        int arynumber=scan.nextInt();

        //variable with random events

        int randMusik=(int)(Math.random()*arynumber);
        int randSport=(int)(Math.random()*arynumber);
        int randViktigt=(int)(Math.random()*arynumber);

        System.out.println(musik[randMusik]);
        System.out.println(sport[randSport]);
        System.out.println(viktigt[randViktigt]);


    }
}
