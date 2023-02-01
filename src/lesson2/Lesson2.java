package lesson2;



public class Lesson2 {
    public static void main(String[] args) {

        lesson2.Book book1 = new lesson2.Book("Тихий Дон");
        lesson2.Book book2 = new Book("Война и Мир");
        lesson2.Book book3 = new lesson2.Book("Тихий Дон");
        lesson2.Book book4 = new Book("Анна Каренина");
        lesson2.Author author1 = new lesson2.Author("Михаил","Шолохов");
        lesson2.Author author2 = new Author("Лев","Толстой");
        lesson2.Author author3 = new Author("Лев","Толстой");
        book1.setPublicationYear(1925);
        book2.setPublicationYear(1863);
        book3.setPublicationYear(1925);
        book4.setPublicationYear(1875);
        System.out.println(book1.equals(book3));
        System.out.println(book1.equals(book4));
        System.out.println(author2.equals(author3));

        System.out.println(author1+" "+book3);
        System.out.println(author2+" "+book2);
        System.out.println(author1+" "+book1);
        System.out.println(author3+" "+book4);
    }
}
