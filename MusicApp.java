import java.util.Scanner;

public class MusicApp {
    private static Scanner scan=new Scanner(System.in);
    private static PlayList playList=new PlayList();

    public static void main(String[] args) {

        /*  1.Create a program that implements a Play list(Music app) with following capabilities
            2.Able to store,modify,remove and search songs in your playlist .
            3.I want to create a separate class for song name and song length).
            4.The PlayList class has the functionality listed above.
            5.Add a menu of options that are available.
            6.Options: Quit, print list of songs , add new song , update existing song ,
                remove song , search/find song from your playlist.
  (boolean) 7.When adding or updating be sure to check if the song already exists(with song name)
            8.Be sure not to expose the inner workings of the ArrayList to PlyList
	            ----->  examples no ints, no .get(i) etc...
            9.PlayList should do everything with Album objects only. */
        boolean quit=false;
        startApp();
        printOptions();

        while (!quit){
            System.out.println("\nEnter action : (6 to show available actions)");
            int option=scan.nextInt();
            scan.nextLine();

        switch (option){
            case 0:
                System.out.println("\nShutting down..");
                quit=true;
                break;
            case 1:
                playList.printAlbumInfo();
                break;
            case 2:
                addNewAlbum();
                break;
            case 3:
                updateAlbum();
                break;
            case 4:
                removeAlbum();
                break;
            case 5:
                queryAlbum();
                break;
            case 6:
                printOptions();
                break;
             }
        }
    }

    private static void startApp(){
        System.out.println("Starting app..");
    }

    //Adding song to your playlist
    private static void addNewAlbum(){
        System.out.println("Enter new song into your playlist: ");
        String songName=scan.nextLine();
        System.out.println("Enter length of the song(in kb): ");
        int length=scan.nextInt();
        Album newAlbum=Album.createAlbum(songName,length);
        if(playList.addNewAlbum(newAlbum)){
            System.out.println("New album added:  name: " +songName+ " ,length : " +length);
        }
        else{
            System.out.println("Cannot add, " + songName+ "already on file");
        }
    }

    //update/modify song in your playlist
    private static void updateAlbum(){
        System.out.println("Enter existing song name: ");
        String songName=scan.nextLine();
        Album existingAlbumRecord=playList.queryAlbum(songName);
        if(existingAlbumRecord==null){
            System.out.println("Album not found.");
            return;
        }
        System.out.println("Enter new song:");
        String newSongName=scan.nextLine();
        System.out.println("Enter new length: ");
        int newLength=scan.nextInt();
        Album newAlbum=Album.createAlbum(newSongName,newLength);
        if(playList.updateAlbum(existingAlbumRecord,newAlbum)){
            System.out.println("Successfully updated");
        }
        else{
            System.out.println("Error updating album.");
        }
    }

    //remove song from your playlist
    private static void removeAlbum(){
        System.out.println("Enter existing song name: ");
        String songName=scan.nextLine();
        Album existingAlbumRecord=playList.queryAlbum(songName);
        if(existingAlbumRecord==null){
            System.out.println("Album not found");
            return;
        }
        if(playList.removeAlbum(existingAlbumRecord)){
            System.out.println("Successfully deleted.");
        }
        else{
            System.out.println("Error deleting album.");
        }
    }

    //search song from your play list
    private static void queryAlbum(){
        System.out.println("Enter existing song name: ");
        String songName=scan.nextLine();
        Album existingAlbumRecord=playList.queryAlbum(songName);
        if(existingAlbumRecord==null){
            System.out.println("Album not found");
            return;
        }
        System.out.println("songName : " +existingAlbumRecord.getSongName()+
                            "\tlength : " + existingAlbumRecord.getLength());
    }

    //print all options you have
    private static void printOptions(){
        System.out.println("\n Available actions:  \n Press ");
        System.out.println("0 - to shutdown\n"+
                            "1 - to print Playlist\n"+
                            "2 - to add new song to playlist\n"+
                            "3 - to update existing song playlist\n"+
                            "4 - to remove existing song from playlist\n"+
                            "5 - to search a song from playlist\n"+
                            "6 - to print available actions");
        System.out.println("Choose your action ");
    }
    }
