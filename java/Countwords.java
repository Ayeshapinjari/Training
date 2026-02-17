import java.util.*;
public class Countwords {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
       /* String st1[]=st.split("\\s+");// if we put + it will count multiple spaces as 1
        System.out.println(st1.length);*/
        int c=0;
        for(int i=0;i<st.length();i++){
            if(i==0 && st.charAt(i)!=' ' || st.charAt(i)!=' ' && st.charAt(i-1)==' ')
            {
                c++;
            }
        }
        System.out.println(c);

    }
}

