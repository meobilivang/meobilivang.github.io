public class Book {

    private int id;
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getId() {
        return id;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String setId(int id) {
        this.id = id;
    }


    public String setTitle(String title) {
        this.title = title;
    }

    public String setAuthor(String author) {
        this.author = author;
    }

}