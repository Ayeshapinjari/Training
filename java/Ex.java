
import java.util.*;
class Ex{
    public static void main(String args[]){
        int a;
        int b;
        Scanner s=new Scanner(System.in);
        System.out.println("enter a,b");
        a=s.nextInt();
        b=s.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
        System.out.println("enter i,j");
        int i=s.nextInt();
        int j=s.nextInt();
        i=i+j;
        j=i-j;
        i=i-j;
        System.out.println(i+" "+j);
        
    }
}