import java.util.*;
class Calculator{
    public static void main (String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter operation");
        char op=s.next().charAt(0);
        System.out.println("enter values");
        int a=s.nextInt();
        int b=s.nextInt();
        switch(op){
            case '+'-> System.out.println(a+b);
            case '*'-> System.out.println(a*b);
            case '-'-> System.out.println(a-b);
            case '/'-> System.out.println(a/b);
            case '%'-> System.out.println(a%b);
            default-> System.out.println("invalid operation");
        }
    }
}