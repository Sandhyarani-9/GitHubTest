import java.util.ArrayList;

public class PlayList {
    private ArrayList<Album>myAlbum;

    //constructor
    public PlayList(){
        this.myAlbum=new ArrayList<Album>();
    }

    //checking if the song is there or not.
    // If it is there it will return false otherwise it will add new song to your playlist.
    public boolean addNewAlbum(Album album){
        if(findAlbum(album.getSongName())>=0){
            System.out.println("Album is already on file");
            return false;
        }
        myAlbum.add(album);
        return true;
    }

    //checking if the song is there is not...If it is there it will return true otherwise false.
    public boolean updateAlbum(Album oldAlbum,Album newAlbum){
        int foundPosition=findAlbum(oldAlbum);
        if(foundPosition<0){
            System.out.println(oldAlbum.getSongName() + " , was not found.");
            return false;
        }
        this.myAlbum.set(foundPosition,newAlbum);
        System.out.println(oldAlbum.getSongName()+ " ,was replaced with " +newAlbum.getSongName());
        return true;
    }

    //checking if the song is there is not..If it is there it will return true otherwise false.
    public boolean removeAlbum(Album album){
        int foundPosition=findAlbum(album);
        if(foundPosition<0){
            System.out.println(album.getSongName()+ " ,was not found .");
            return false;
        }
        this.myAlbum.remove(foundPosition);
        System.out.println(album.getSongName()+ ", was deleted.");
        return true;
    }

    public String queryAlbum(Album album){
        if(findAlbum(album)>=0){
            return album.getSongName();
        }
        return null;
    }

    //search for the song
    public Album queryAlbum(String songName){
        int position=findAlbum(songName);
        if(position>=0){
            return this.myAlbum.get(position);
        }
        return null;
    }

    private int findAlbum(Album album){             //it is return an integer showing us what the position is
        return this.myAlbum.indexOf(album);         // in the array for the particular album object.
    }

    private int findAlbum(String albumSongName){    //overloading in this time.It is going to findAlbum,but
        for(int i=0;i<this.myAlbum.size();i++){     // it's going to be accepting a string,so it is albumSongName.
            Album album=this.myAlbum.get(i);
            if(album.getSongName().equals(albumSongName)){
                return i;
            }
        }
        return -1;                 // It is getting back to addNewAlbum.
    }

    public void printAlbumInfo() {
        System.out.println("Album list: ");
        for (int i = 0; i < this.myAlbum.size(); i++) {
            System.out.println((i + 1) + "." + this.myAlbum.get(i).getSongName()
                    + "--->" + this.myAlbum.get(i).getLength());
        }
    }
}
