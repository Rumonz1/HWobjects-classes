public class Book {
    private final String bookName;
    private final Author authorName ;
    private int publicationYear;

    public Book(String bookName, Author name, int publicationYear) {
        this.bookName = bookName;
        this.authorName = name;
        this.publicationYear = publicationYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getName() {
        return authorName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
