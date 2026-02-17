import java.util.*;
public class Countdig {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0;
        //int dig;
        for(int i=n;i>0;i/=10){
            //dig=n%10;
            n=n/10;
            c++;
        }
        System.out.println(c);
       
    }
}
