public class Author {
    private final String firstName;
    private final String secondName;

    public Author(String authorName, String secondAuthorName) {
        this.firstName = authorName;
        this.secondName = secondAuthorName;
    }

    public String getAuthorName() {
        return firstName;
    }

    public String getSecondAuthorName() {
        return secondName;
    }

}
