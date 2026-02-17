import java.util.*;

public class Collatzz {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i=0;
      while(n!=1){
        
      if(n%2==0){
        n=n/2;
      }
      else{
        n=3*n+1;
      }  
      i++;
      
    }
    System.out.println(i);
       System.out.println(n);
    
    }
}
