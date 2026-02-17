import java.util.*;
public class InputArray {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int arr[]=new int[5];
        int sum=0;
        System.out.println(" Enter array elements ");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
            sum+=arr[i];
        }
        System.out.print("array elements are : ");
     for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
      int odd=0;
      int even=0;
      for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("odd count: "+odd+" even count :"+even);
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("min value: "+min+" max value :"+max);



}
}
