import java.util.ArrayList;

public class BookList {
   // private String myBook;
    private ArrayList<AudioBook> myBookList;

    //constructor
    public BookList(){
     //   this.myBook=myBook;
        this.myBookList=new ArrayList<AudioBook>();
    }

    public boolean addNewBook(AudioBook audioBook){
        if(findBook(audioBook.getTitle())>=0){
            System.out.println("Book is already saved.");
            return false;
        }
       myBookList.add(audioBook);
        return true;
    }


    private int findBook(AudioBook audioBook){ //This method for find object index
        return this.myBookList.indexOf(audioBook);
    }
    //overload method findBook ie we are using same methods with different parameters
    private int findBook(String bookTitle){
        for(int i=0;i<this.myBookList.size();i++){
            Book book=this.myBookList.get(i);
            if(book.getTitle().equals(bookTitle)){
                return i;
            }
        }
        return -1;
    }
    public void showBookInfo(){
        System.out.println("Book list : ");
        for(int i=0;i< myBookList.size();i++){
            System.out.println((i+1)+ "." +
                    this.myBookList.get(i).getTitle() + "-->" +
                    this.myBookList.get(i).getAuthor() + "-->" +
                    this.myBookList.get(i).getLength() + "-->" +
                    this.myBookList.get(i).getFormat());
        }
    }
}
