
import java.util.*;
public class ReadArray {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n]; 
        System.out.print("enter values:  ");                                                             
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(int vals: arr){
            System.out.print(vals+ " ");
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("Maximum value "+max);
        System.out.println("Manimum value "+min);
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("even count "+ even);
         System.out.println("odd count "+ odd);
    s.close();
    }
}
