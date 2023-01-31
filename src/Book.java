public class Book {
    private String title;
    private int publicationYear;

    public Book(String title){
        this.title = title;


    }

    public  String getTitle(){
        return this.title;
    }


    public int getPublicationYear(){
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }


}
