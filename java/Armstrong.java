import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int temp=n;
    int sum=0;
    int count=0;
    while(n>0){
    int dig=n%10;
        count++;
        n/=10;
    }
    n=temp;
    while(n>0){
        int d=n%10;
        sum+=(int)Math.pow(d,count);
        n/=10;
    }
    if(sum==temp){
         System.out.println(temp+" is a armstrong number");
    }
    else{
         System.out.println(temp+" is not  a armstrong number");
    }
    }
}
