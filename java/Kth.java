public class Kth {
    public static void main(String args[]){
        int arr[]={1,1,3,2,4,3,4,5,6};
        int k=4;
        int i,j;
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
        System.out.println(arr[k-1]);
    }
}
