import java.util.*;
class Airport{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in) ;
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      //1 0 2 0 1 0 2
      int z=0,o=0,t=0;
      for(int i=0;i<n;i++){
        if(arr[i]==0){
            z++;
        }
        if(arr[i]==1){
            o++;
        }
        if(arr[i]==2){
            t++;
        }
      }
      int index=0;
      while(z>0){
        arr[index++]=0;
        z--;
      }
      while(o>0){
        arr[index++]=1;
        o--;
      }
      while(t>0){
        arr[index++]=2;
        t--;
      }
      for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
      }


        }
}