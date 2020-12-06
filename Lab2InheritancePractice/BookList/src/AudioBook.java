public class AudioBook extends Book {
private int length;// in minutes
private String format;

    public AudioBook(String title, String author, int length, String format) {
        super(title, author);
        this.length = length;
        this.format = format;
    }

    public int getLength() {
        return length;
    }

    public String getFormat() {
        return format;
    }
}
