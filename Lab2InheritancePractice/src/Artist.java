public class Artist extends Album{
    private String artistName;
    private int rating;

    public Artist(String songName, int length, String artistName, int rating) {
        super(songName, length);
        this.artistName = artistName;
        this.rating = rating;
    }

    public String getArtistName() {
        return artistName;
    }

    public int getRating() {
        return rating;
    }
}
