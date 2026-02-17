
import java.util.*;
class Defense{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int d=s.nextInt();
        int n=s.nextInt();
        int h[]=new int[n];
        for(int i=0;i<n;i++){
            h[i]=s.nextInt();
        }
        int max=0;
        boolean found=false;
        for(int i=0;i<n;i++){ //0 1 2
            if(h[i]<=d){// 1000 100 
                //max=i;// 0
                found=true;
                if(h[i]>h[max]){// 1000 
                    max=i; //0 
                }
            }
        }
        if(found){
            System.out.println("h:"+max);
        }
        else{
            System.out.println("Retreat");
        }

    }
}