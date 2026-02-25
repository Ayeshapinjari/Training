// lamda expression - write a method without giving it a name
interface Add{// functional interface
    int sum(int a,int b);
}
//functional interface contains exactly one abstract method
public class Lambda {
    public static void main(String[] args) {
      Add obj=(a,b)->a+b;
      System.out.println(obj.sum(3,5));  
    }
}
