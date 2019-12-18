class Book {
    private String bookid;
    private String bookname;
    protected int pages;//包内，子类可以访问

    public Book(String bookid, String bookname, int pages) {
        this.bookid = bookid;//调用同一个类的构造方法
        this.bookname = bookname;//调用同一个类的构造方法
        this.pages = pages;//调用同一个类的构造方法
    }

    public String getBookid() {
        return bookid;//调用同一个类的构造方法
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;//调用同一个类的构造方法
    }

    public String getBookname() {
        return bookname;//调用同一个类的构造方法
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;//调用同一个类的构造方法
    }

    public int getPages() {//访问pages
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
public class Dictionary extends Book {//继承出来的子类
    private int pingyinPages;

    public Dictionary(String bookid, String bookname, int pages,int pingyinPages) {
        super(bookid, bookname, pages);//supre调用父类
        this.pingyinPages = pingyinPages;//调用同一个类的构造方法
    }

    public int getPingyinPages() {
        return pingyinPages;
    }

    public void setPingyinPages(int pingyinPages) {
        this.pingyinPages = pingyinPages;//调用同一个类的构造方法
    }
}
public class Bookmanager {
    public static void main(String[] args){
        Dictionary dictionary = new Dictionary("INB001","free",90,3);//向上类型转换
        System.out.println(dictionary.getPingyinPages());
        System.out.println(dictionary.getBookid());
        System.out.println(dictionary.getBookname());
    }
}

}
public class Bookmanager {
    public static void main(String[] args){
        Dictionary dictionary = new Dictionary("INB001","free",90,3);
        System.out.println(dictionary.getPingyinPages());
        System.out.println(dictionary.getBookid());
        System.out.println(dictionary.getBookname());
    }
}
