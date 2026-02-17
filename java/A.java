import java.util.*;
class A{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n] ;//2 4 6 7 8 
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int e=0;
        int o=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
              e++; 
            }
            else{
                o++;
            }
        }
        if(e==n){
            System.out.println("even");
        }
        else if(o==n){
            System.out.println("odd");
        }
        else{
            System.out.println("mixed");
        }
    }
}