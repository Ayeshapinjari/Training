public class Freq {
    public static void main(String args[]){
        int arr[]={10,20,30,30,20,40,40,10};
        boolean v[]=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            v[i]=false;
        }
        for(int i=0;i<arr.length;i++){
            if (v[i]){
                continue;
            }
            int c=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                    v[j]=true;
                }
            }
            System.out.println(arr[i]+" "+c);
        }
    }
}
