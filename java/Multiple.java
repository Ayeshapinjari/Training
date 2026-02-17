interface A {
    public void msg();
}
interface B{
    public void msg1();
}
class Child implements A,B{
   public void msg(){
        System.out.println("interface A");
    }
    public void msg1(){
        System.out.println("interface B");
    }
}
class Multiple{
    public static void main(String args[]){
        Child obj=new Child();
        obj.msg();
        obj.msg1();
    }
}
