class Parent{
    //DYNAMIC DISPATCH one refers parent methods also known as UPCASTING
    void p(){
        System.out.println("parent message");
    }
}
class Child extends Parent{
    //DYNAMIC DISPATCH one refers parent methods also known as upcasting
    void c(){
        System.out.println("child message");
    }
}
class MethodOverride{
    public static void main(String[] args) {
        Parent obj=new Child(); // OBJ IS CHILD OBJ WHICH ACCESS ONLY PARENT METHODS like implicit
        obj.p();
        // OBJ.C(); EVEN THOUGH IT IS CHILD OBJ IT ONLY ACCESS PARENT METHODS
        if (obj instanceof Child) { // given obj is child object or not
            Child obj1 = (Child) obj; //DOWNCASTING like explicit
            //obj1.c();// now obj1 can access both parent and child classes
           obj1.p();
            }
    }
}