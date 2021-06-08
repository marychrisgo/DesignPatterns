package homework;

public class BookRecord {

    private String author;
    private String title;
    private String location;

    public BookRecord(String author, String title, String location) {
        this.author = author;
        this.title = title;
        this.location = location;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "BookRecord{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
