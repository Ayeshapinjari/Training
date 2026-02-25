// to find no of elements in an array are greater than prior elements
//7 4 8 2 9
//op : 3
import java.util.*;
class Prior{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int c=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max=arr[i];
                c++;
            }
        }
        System.out.println("count"+c);
    }
}