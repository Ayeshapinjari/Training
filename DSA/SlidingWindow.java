//sum of max element in subarray k
class SlidingWindow{
    public static void main(String args[]){
        int arr[]={2,1,5,1,3,2};
        int k=3;
        int ws=0;
        int max=0;
        int l=0;
        for(int i=0;i<arr.length;i++){
            ws+=arr[i];
            if(i>=k-1){
                max=Math.max(max,ws);
                ws-=arr[l];
                l++;
            }
        }
    System.out.println(max+" ");
    }
}