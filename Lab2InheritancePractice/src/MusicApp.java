import java.util.Scanner;

public class MusicApp {
    private static Scanner scan = new Scanner(System.in);
    private static PlayList playList = new PlayList();

    public static void main(String[] args) {
        /* 1.Create a program that implements a Play list(Music app) with following capabilities
           2.Artist handles album (for playlist)
           3.It is showing the all saved songs and showing all playlist songs.
           4.The Artist is rewritten so that it handles a more information about the song
           5.You can save, view a song name, length,artist name and rating for the song.
           6.There is a separate class for Album (song names(title) and length numbers).
           7.We have a class (PlayList) that takes care of an ArrayList for "Album".
           8.The "PlayList" class takes care of all the functionality above.
           9.We have a menu in the MusicApp class (the one with static void main)
          10.Options in the menu: Quit, show the list of all songs, Add a new song.
          11.When we add a song, we check if the song already exists, and it will search with song name. */


        boolean quit = false;
        startApp();
        printActions();
        while (!quit) {
            System.out.println("\n Choose - 3 to show all choices.");
            int action = scan.nextInt();
            scan.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\n shutting down..");
                    quit = true;
                    break;
                case 1:
                    playList.printAlbum();
                    break;
                case 2:
                    addNewAlbum();
                    break;
                case 3:
                    printActions();
                    break;
            }
        }
    }

    public static void addNewAlbum() {
        System.out.println("Enter song for your playlist: ");
        String songName = scan.nextLine();
        System.out.println("Enter length of the song(in kb) :");
        int length = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter artist name of the song: ");
        String artistName = scan.nextLine();
        System.out.println("Enter rating of the song: ");
        int rating = scan.nextInt();

        Artist newAlbum = new Artist(songName, length, artistName, rating);
      if (playList.addNewAlbum(newAlbum)) {
            System.out.println("New album added:\nsongName: " + songName + " , length : " + length+ " ,Artist name: " +artistName+ " , rating: " +rating);
        } else {
            System.out.println("Can not add, " + songName + " already there.");
        }
    }



    private static void startApp() {
        System.out.println("Start app..");
    }

    private static void printActions() {
        System.out.println("\nChoose:\n");
        System.out.println("0  - Shutting down \n" +
                "1  - show playlist\n" +
                "2  - Create new album to your playlist\n" +
                "3  - show all available options.");
    }
}
