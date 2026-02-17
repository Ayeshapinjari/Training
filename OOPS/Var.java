class A{
    int age;// instance accesed using obj
    static int getage(int age){
        int b=10; // must intialise because local var
        return b+age;
    }
    static String name ;//static var accessed using class name it can have dfault values
    String getname(){
        return name;
    }
}
class Var{
    public static void main(String args[]){
        A obj=new A();
        int a=A.getage(10);//static method
        System.out.println(a);
        System.out.println(obj.getname());//instance method



    }
}