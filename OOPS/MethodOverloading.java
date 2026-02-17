class A{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(double a,int b){
        System.out.println(a+b);
    }
    void add(int a,double b){
        System.out.println(a+b);
    }
    /* 
    void add(int x,double y){
        System.out.println(a+b); //PARAMETERS NAME CHANGE CANT OVERLOAD
    }
        */
    /* 
    int add(int a,double b){  //RETURN TYPE ALONE CANT OVERLOAD
       return a+b;
    }
       */
}


public class MethodOverloading {
    public static void main(String[] args) {
    A obj=new A();
    obj.add(2,3);
    obj.add(1,2,3);
    obj.add(1.0,1);
    obj.add(2,3.0);

}
}
