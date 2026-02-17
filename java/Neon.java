import java.util.*;
public class Neon {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int sq=n*n;
    int sum=0;
    // n=9 9-square 81 8+1=9 9 is neon number
    while(sq>0){

        sum+=sq%10;
        sq/=10;
    }
    if(sum==n){
        System.out.println(sum+" is a neon number");
    }

    
   } 
}
