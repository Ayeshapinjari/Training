public class Issort {
    public static void main(String[] args) {
        int a[]={2,3,3,5};
        // is array sorted or not increasing or not
        boolean d=true,in=true;
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){// a[i]>=a[i+1] for decreasing sorted 
                in=false;
            }
            else if(a[i]<a[i+1]){
                d=false;
            }
        }
        if(d){
            System.out.println("decreasing sort");
        }
        else if(in){
            System.out.println("increasing sort");
        }
        else{
            System.out.println("not sorted");
        }
    }
}
