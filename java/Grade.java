import java.util.*;
public class Grade {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        char g=(m>90)?'A':(m<90 && m>=80)?'B':(m<80 && m>=70)?'C':(m<70 && m>=60)?'D':(m<60 && m>=50)?'E':'F';
        System.out.println(g);
    }
}
