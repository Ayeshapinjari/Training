
//  ABSTRACT CLASS
/* 
abstract class Parent {
    Parent(){
        System.out.println("Parent constructor");
    }
    abstract void message();
    abstract void msg1();    
}
abstract class Child extends Parent{
    
}
 class B extends Parent{ 
    void message(){
        System.out.println("method 1");
        
    }
    
    void msg1(){
        System.out.println("method 2");
    }
}

class AbstractEx{
    public static void main(String[] args) {
        B obj=new B();
        obj.message();
        obj.msg1();
    }
}
*/
//INTERFACES
 interface A{
     int a=10; // it allow public static final default only // by default variables will be public static final 
    void msg(); // interface not allow constructor
    void msg1();
 }
 class B implements A{
    public void msg(){ // public must 
        System.out.println("method 1");
    }
   public void msg1(){
        System.out.println("method 2");
    }
 }
 class AbstractEx{
    public static void main(String[] args) {
        B obj=new B();
        
        System.out.println(A.a);
        System.out.println(B.a);
        
        obj.msg();
        obj.msg1();
    }
}
