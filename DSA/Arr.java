import java.util.*;
public class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
         int[] arr = new int[n];
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
         int max=Integer.MIN_VALUE;
         int min=Integer.MAX_VALUE;
         int c=0;
         for (int i = 0; i < arr.length; i++) {
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);
            if(arr[i]%2==0){
                c++;
            }
         }
         System.out.println("max :"+max);
         System.out.println("min :"+min);
         System.out.println("even count"+c);
         int l=0;
         int r=n-1;
         while(l<=r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
         }
         System.out.println("reverse array");
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
         }
         boolean in=true;
         boolean de=true;
         for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                in=false;
            }
            else if(arr[i]<arr[i+1]){
                de=false;
            }
         }
         if(de || in){
            System.out.println("sorted");
         }
         else{
        
            System.out.println("not sorted");
         
         }
    }
}
