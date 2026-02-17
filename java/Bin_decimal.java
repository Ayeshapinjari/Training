import java.util.*;
public class Bin_decimal{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       //taking string input
    //    String s=sc.nextLine();
    //    int p=0,d=0; 
    //    for(int i=s.length()-1;i>=0;i--){
    //     char ch=s.charAt(i);
    //     if(ch=='1'){
    //         d+=Math.pow(2,p);
    //     }
    //     p++;
    //    }
    //    System.out.println(d+" ");
    int b=sc.nextInt();
    int d=0,p=0;
    while(b>0){
        int dig=b%10;
        d+=dig*Math.pow(2,p);
        p++;
        b/=10;
    }
    System.out.println(d+" ");
    }
}