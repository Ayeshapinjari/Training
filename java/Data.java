import java.util.*;
public class Data {
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter a,b");
int a=s.nextInt();
int b=s.nextInt();
int t;
t=a;
a=b;
b=t;
System.out.println(a+" "+b);
}
}
