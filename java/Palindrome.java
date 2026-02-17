import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String rev="";
        //method 1
       /* for(int i=0;i<str.length();i++){
            rev+=str.charAt(str.length()-1-i);
        }*/
       //method 2

        /*for(int i=str.length();i<=0;i--){
            rev+=str.charAt(i);
        }*/
       //method 3
       rev=new StringBuilder(str).reverse().toString();
    
        if(rev.equals(str)){ //never use ==
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
