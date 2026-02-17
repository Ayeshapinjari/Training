// super() vs. this(): Create Parent class A
// and Child class B. B has two constructors:
// B() calls this(10), and B(int i) calls super().
// A() prints "A". B(int i) prints "B".
class A{
A(){
    System.out.println("A");
}
}
class B extends A{
B(){
    this(10);
}
B(int i){
    super();
    System.out.println("B"+i);
}
}

public class T {
    public static void main(String args[]){
 B obj =new B();
 
    }
}
