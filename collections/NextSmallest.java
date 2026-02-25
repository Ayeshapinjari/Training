import java.util.*;
public class NextSmallest {
    public static void main(String[] args) {
        int arr[]={4,5,2,10,8};
        int res[]=new int[arr.length];
        //BRUTE FORCE
        // for (int i = 0; i < res.length; i++) {
        //     res[i]=-1;
        // }
        // for (int i = 0; i < res.length; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[j]<arr[i]){
        //             res[i]=arr[j];
        //             break;
        //         }
        //     }
        // }
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&& s.peek()>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                res[i]=-1;
            }
            else{
                res[i]=s.peek();
            }
            s.push(arr[i]);
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
