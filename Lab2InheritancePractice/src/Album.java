public class Album {
    private String songName;
    private int length;

    //constructor
public Album(String songName,int length){
    this.songName=songName;
    this.length=length;
}

    public String getSongName() {
        return songName;
    }

    public int getLength() {
        return length;
    }
}
