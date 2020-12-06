public class OvaTidsmaskin {
    public static void main(String[] args) {
        String[] musik = {"melody", "fast song", "enjoyable songs", "meaning songs", "god songs"};
        String[] sport = {"tennis", "foot boll", "hockey", "cricket", "Uno"};
        String[] viktigt = {"home", "job", "friends", "travelling", "food"};

// Variable for number of elements in all arrays
        int arrAntal = 5;

        for (int i = 1968; i <=1972; i++) {



            int randmusik = (int) (Math.random() * arrAntal);
            int randsport = (int) (Math.random() * arrAntal);
            int randviktigt = (int) (Math.random() * arrAntal);

            System.out.println("året är:"+i);
            System.out.println(musik[randmusik]);
            System.out.println(sport[randsport]);
            System.out.println(viktigt[randviktigt]);


        }
    }
}
