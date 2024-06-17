package day08;

public class book {

    private String bookName;
    private String auther;

    //2.생성자
    public  book(){};
    public book(String bookName, String auther) {
        this.bookName = bookName;
        this.auther = auther;
    }

    //3. 메소드

    public void showBookinfo(){
        System.out.println(this.bookName+","+this.auther);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }
}
