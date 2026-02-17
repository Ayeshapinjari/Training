/*final instance variable: Create a class
with a final int ID. Initialize it in the
constructor. In a method, try to change it
(ID = 2;). What is the result? */
/* 
class A{
    final int id;
    A(int id){
        this.id=id;
    }
    void change(){
        //id=2; //T3.java:11: error: cannot assign a value to final variable id
    
        
    }
}
public class T3 {
    public static void main(String[] args) {
        A obj =new A(1);
        obj.change();
    }
}
*/
// 5 PROBLEM
 /*
static final constants: Create a Config
class with public static final int
MAX_USERS = 100;. In main, print
Config.MAX_USERS.
  */
/* 
class T3{
    public static final int MAX_USERS=100;
    public static void main(String[] args) {
        System.out.println(T3.MAX_USERS);
    }
}
    // 6 PROBLEM
    */
   /*Static methods cannot use this: Create a
class with int instanceVar = 10;. Add static
void myMethod() { System.out.println(this.
instanceVar); }. What is the result? */
/* 
class T3{
    int instanceVar = 10;
    static void myMethod() { System.out.println(this.instanceVar); } //non-static variable this cannot be referenced from a static context

    public static void main(String[] args) {
        T3 obj=new T3();
        obj.myMethod();
    }
}
    */
   // 7 PROBLEM
   /*Static factory method: Create User with a
private constructor. Add a public static
User createAdmin(String name) that calls
the private constructor to create a User
with role "ADMIN". */
class User{
   String name;
   String role;
    private User(String name,String role){
        this.name=name;
        this.role=role;
    }
    public static User createAdmin(String name){
        return new User(name,"admin");
    }
}
class T3{
    public static void main(String[] args) {
        //T3 obj=new T3();
        T3.createAdmin("Admin");
    }
}
