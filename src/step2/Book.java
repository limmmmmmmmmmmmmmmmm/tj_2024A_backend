package step2;

public class Book {

    String bookName;
    String auther;

    public Book(String bookName, String auther) {
        this.bookName = bookName;
        this.auther = auther;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", auther='" + auther + '\'' +
                '}';
    }
}

