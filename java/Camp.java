import java.util.Scanner;
public class Camp{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
float z=sc.nextFloat();
float l=(float) x*(1.0f/y);
float p=z*l;
float m=30*p;
System.out.printf("%.2f",m);
    }
}