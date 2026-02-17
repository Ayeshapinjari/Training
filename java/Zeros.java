class Zeros{
    public static void main(String args[]){
        int a[]={1,2,0,3,4,5,0,0,6,7,0,8,9};
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[j++]=a[i];
            }
        }
        while(j<a.length){
            a[j++]=0;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}