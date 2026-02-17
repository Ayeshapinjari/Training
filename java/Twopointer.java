import java.util.*;
public class Twopointer {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int l=0;
        int r=a.length-1;
        while(l<r){
            int t=a[l];
            a[l]=a[r];
            a[r]=t;
            l++;
            r--;
        }
        System.out.print(Arrays.toString(a));
        String s="madam";
        int i=0;
        int j=s.length()-1;
        boolean ispal=true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                ispal=false;
                break;
            }
            i++;
            j--;
            
        }
        System.out.println(ispal);

        int b[]={1,2,3,1,1,4,5};
        int p=0;
        for(i=0;i<b.length;i++){
    if(b[i]!=1){
    b[p++]=b[i];
    }
        }
        for(i=0;i<=j+1;i++){
            System.out.print(b[i]);
        }
         
    }
}
