
import java.util.Scanner;
public class ReadArrayy {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int val: arr){
            val=sc.nextInt();
            System.out.print(val+" ");
        }
    sc.close();
    }
}
