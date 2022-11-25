public class Main {
    public static void main(String[] args) {
        Author first = new Author("Василий", "Батьков");
        Author second = new Author("Troy", "Terner");
        Book book1 = new Book("Тысяча способов выучить язык Java", first , 2020);
        Book book2 = new Book("How to build a building", second, 1962);
        System.out.println("Автор книги: "+first.getAuthorName()+" "+first.getSecondAuthorName()+". Название книги: "+book1.getBookName()+". Опубликована в: "+book1.getPublicationYear()+" году.");
        System.out.println("Автор книги: "+second.getAuthorName()+" "+second.getSecondAuthorName()+". Название книги: "+book2.getBookName()+". Опубликована в: "+book2.getPublicationYear()+" году.");

    }
}