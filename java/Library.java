import java.util.*;
class Book{
    String title;
    String author;
    Book(String title){
        this.title=title;
        author="unknown";
    }
    Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    void display(){
        System.out.println(title+" "+author);
    }
}
class Library{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String title=s.nextLine();
        String author=s.nextLine();
        Book b=new Book(title,author);
        b.display();
        Book b1=new Book(title);
        b1.display();



    }
}