class A{
    String name;
    int age;
    A(){
        this("arfan",22);
        System.out.println("constructor chaining");
    }

    A(String name,int age){ // parameterised constructor
        this.name=name;
        this.age=age;
    }
    void display(){
         System.out.println(name);
         System.out.println(age);

    }

    // A(){ // default constructor
    //     System.out.println("default");
    // }

    // A(A obj){ //COPY CONSTRUCTOR
    //     this.name=obj.name;
    //     this.age=obj.age;
    // }

}
 class B extends A{
    String address;


    B(String address){
        //super("ayesha",20); //inherited constructor
        //super();
        this.address=address;
    }
    void display(){
        super.display();
        System.out.println(address);
    }

 }

public class Constructor {
    public static void main(String[] args) {
        B obj=new B("ATP");
        obj.display();
       // A obj1=new A(obj); copy constructor
       // System.out.println(obj.name+" "+obj.age);
        //System.out.println(obj1.name+" "+obj1.age);
        // A obj2=new A();

    }
}
