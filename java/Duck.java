import java.util.Scanner;

public class Duck {
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    String str=String.valueOf(n);
    char[] c=str.toCharArray();
    for(int i=0;i<c.length;i++){
        if(c[i]=='0'){
            System.out.println(n+" is a duck number");
        }
    }
    /*int temp=n;
    int f=0;
    if(n==0){
        f=1;
    }
    while(n>0){
        int dig=n%10;
        if(dig==0){
           f=1;
           break; 
        }
        n/=10;
    }
    if(f==1){
        System.out.println(temp+" is a duck number");
    }*/
  
    }
}
