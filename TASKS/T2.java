/*super vs this for methods/fields: Parent
has void who() printing "Parent". Child
overrides who() to print "Child". A third
method in Child, test(), calls this.who()
and super.who(). */
class Parent{
    void who(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    void who(){
        System.out.println("Child");
    }
    void test(){
        this.who();
        super.who();
    }
}
class T2{
    public static void main(String[] args) {
        Child c=new Child();
        c.test();
    }
}