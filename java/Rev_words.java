
import java.util.Scanner;
public class Rev_words {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String c[]=s.trim().split(" ");
        String rev[]=new String[c.length];
        for(int i=0;i<c.length;i++){
            rev[i]=c[c.length-1-i];
        }
        for(int i=0;i<rev.length;i++){
            System.out.print(rev[i]+" ");
        }

    }
}
