package TaskPractice;

public class Book implements Comparable<Book>{
    int id;
    String titleName;
    String AuthorName;

    public Book() {
    }

    public Book(int id, String titleName, String authorName) {
        this.id = id;
        this.titleName = titleName;
        AuthorName = authorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }




    @Override
    public int compareTo(Book book) {
        return this.titleName.compareTo(book.getTitleName());
    }
}
