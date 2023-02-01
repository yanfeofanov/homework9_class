package lesson1;

public class Lesson1 {
    public static void main(String[] args) {

        Book book1 = new Book("Тихий Дон");
        Book book2 = new Book("Война и Мир");
        Author author1 = new Author("Михаил","Шолохов");
        Author author2 = new Author("Лев","Толстой");
        book1.setPublicationYear(1928);
        book2.setPublicationYear(1863);

        System.out.println("Писатель "+author1.getName()+" "+author1.getLastName()+" навзвание книги "+book1.getTitle()+" год публикации "+book1.getPublicationYear());
        System.out.println("Писатель "+author2.getName()+" "+author2.getLastName()+" навзвание книги "+book2.getTitle()+" год публикации "+book2.getPublicationYear());
    }
}
