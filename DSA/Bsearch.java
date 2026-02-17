class Bsearch{
     public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int l=0,r=arr.length-1;
        int key=10;
        boolean found=false;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==key){
                found=true;
                break;
            }
            else if(key<arr[mid]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        System.out.println(found);
    }
}