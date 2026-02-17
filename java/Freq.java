import java.util.*;
// frequency of array elements
/* 1 => 2
    2 => 2
    3 => 1
 */
public class Freq {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int arr[]={1,1,2,2,3,3};
        int n=arr.length;
        boolean b[]=new boolean[n];
        for(int i=0;i<n;i++){
            b[i]=false;
        }
        for(int i=0;i<n;i++){
            if(b[i]){
                  continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    b[j]=true;
                }
            }
            System.out.println(arr[i]+" => "+count);
        }
        /* 
        String str=s.nextLine();//swiss
        int len=str.length();
        boolean b[]=new boolean[len];
        // FIRST NON REPEATING CHAR
        for(int i=0;i<len;i++){ // TO KNOW VISITED CHARS
            b[i]=false;
        }
        for(int i=0;i<len;i++){// 0
            if(b[i]){ // TO IGNORE THE VISITED  OR ALREADY COUNTED CHARS
                continue;
            }
            int count=0;
            for(int j=i+1;j<len;j++){// 1 2 3 4 5<5
                if(str.charAt(i)==str.charAt(j)){// s==w s==i s==s s==s
                    count++;//1 2
                    b[j]=true;// F F F T T
                }
            }
            if(count==0){ //c=2 false
                System.out.println(str.charAt(i));
                break;
            }
        }
            */



    }
}
