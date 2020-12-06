import java.util.ArrayList;

    public class PlayList {
        private ArrayList<Artist> playList;

        //constructor

        public PlayList() {
            this.playList = new ArrayList<Artist>();
        }

        public boolean addNewAlbum(Artist artist) {
            if (findAlbum(artist.getSongName()) >= 0) {
                System.out.println("Album already saved.");
                return false;
            }
            playList.add(artist);
            return true;
        }

        private int findAlbum(Artist artist){
            return this.playList.indexOf(artist);
        }

        private int findAlbum(String albumName) {
            for (int i = 0; i < this.playList.size(); i++) {
                Artist artist = this.playList.get(i);
                if (artist.getSongName().equals(albumName)) {
                    return i;
                }
            }
            return -1;
        }

        public void printAlbum() {
            System.out.println("Playlist:");
            for (int i = 0; i < this.playList.size(); i++) {
                System.out.println((i + 1) + "." +
                        this.playList.get(i).getSongName() + " ---> " +
                        this.playList.get(i).getLength() + " ---> " +
                        this.playList.get(i).getArtistName() + " ---> " +
                        this.playList.get(i).getRating());
            }
        }
    }