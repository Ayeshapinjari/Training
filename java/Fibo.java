import java.util.*;
class Fibo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;

        //System.out.print(a+" "+b+" ");
        if(n==0 || n==1){
            System.out.println(n+" is a fibonacci");
        }
        boolean f=false;
        for(int i=0;i<=n;i++){
            int c=a+b;// 1 2 3
            if(c==n){
            f=true;
            break;
            }
            else if(c>n){
                f=false;
                break;
            }
            a=b;//1 1 2
            b=c;//1 2 3

        }
        if(f){
            System.out.println(n+" is a fibonnacci number");
        }
        else{
            System.out.println(n+" is not a fibonnacci number");
        }


    }
}