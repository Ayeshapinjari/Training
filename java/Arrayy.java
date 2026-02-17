import java.util.*;
public class Arrayy {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String line=s.nextLine();
        String[] p=line.split(" ");
        int a[]=new int[p.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(p[i]);
            //System.out.print(a[i]+" ");
        }
       /* for(int i=1;i<a.length;i+=2){
            if(i%2==0){
                int temp=a[i];
                a[i]=a[i-1];
                a[i-1]=temp;
            }
            System.out.print(a[i]+" ");
        }*/
        //method 2
        for(int i=0;i<a.length-1;i+=2){
            
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
        }
        for(int i=0;i<a.length;i++){
            
        System.out.print(a[i]+" ");

    } 
}
}
