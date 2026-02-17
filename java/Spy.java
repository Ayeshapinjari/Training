import java.util.Scanner;

public class Spy {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    // sum of digits = products of digits
    int sum=0;
    int temp=n;
    int product=1;
    while (n>0){
        int dig=n%10;
        sum+=dig;
        product*=dig;
        n/=10;
    }
     if(sum==product){
        System.out.println(temp+" is a neon number");
    }
    }
}
