import java.util.*;
class Rev{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter size");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("enter target");
        int k=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    System.out.println(i+" "+j);
                    
                }

            }
        }

    }
}