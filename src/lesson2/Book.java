package lesson2;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publicationYear);
    }

    @Override
    public String toString(){
        return "название книги "+title+" год публикации "+publicationYear;
    }


}
