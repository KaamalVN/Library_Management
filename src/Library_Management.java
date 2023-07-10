class Library_item{


    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    String title;
    int year;
    void library_item(){
        System.out.println("Executing class Library_item :"+id+" "+title+" "+year);
    }
}

class Book extends Library_item{
    String author;
    void book(){
        System.out.println("Executing class Book :"+author);
    }
}

class Magazine extends Library_item{
    int issue;
    void magazine(){
        System.out.println("Executing class Magazine :"+issue);
    }
}

public class Library_Management {
    public static void main(String[] args) {
        Book bookobj=new Book();
        Magazine magazineobj=new Magazine();
        bookobj.author="JK Rowling";
        bookobj.book();
        magazineobj.issue=2;
        magazineobj.magazine();
        bookobj.setId(101);
        bookobj.title="Harry Potter";
        bookobj.year=2023;
        bookobj.library_item();
    }
}