import java.util.*;
class NextGreater{
    public static void main(String[] args) {
        int arr[]={2,1,2,4,3}  ;
        int res[]=new int[arr.length];
        // 1st way
        // for (int i = 0; i < arr.length; i++) {
        //     res[i] = -1;
        // } 
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[j]>arr[i]){
        //             res[i]=arr[j];
        //             break;
        //         }
                
        //     }
        // }
        // for (int i = 0; i < res.length; i++) {
        //     System.out.print(res[i] + " ");
        // }
        //2nd way
        //Monotonic Stack
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&& s.peek()<=arr[i]){
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
             System.out.print(res[i] + " ");
        }
     }
}