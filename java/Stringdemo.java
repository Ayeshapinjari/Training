import java.util.*;
public class Stringdemo {
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
   /* int n=s.nextInt();
    StringBuilder sb=new StringBuilder();
    for(int i=1;i<=n;i++){
        sb.append(i); // low memory usage
    }
    System.out.println(sb);
    String str="";
    for(int i=1;i<=n;i++){
        str+=i; // high memory usage because for everi iteration it create new obj
    }
    System.out.println(str);*/
    /* 
    String str=s.nextLine();
    StringBuilder sb=new StringBuilder(str);
    int l=0;
    int r=sb.length()-1;// without using reverse() and in place we have to reverse
    while(l<r){
        char t=sb.charAt(l);
        sb.setCharAt(l, sb.charAt(r));
        sb.setCharAt(r, t);
        l++;
        r--;
    }
System.out.println(sb);
String str1=sb.toString();
for(int i=0;i<sb.length();i++){
    sb.setCharAt(i, str1.charAt(str1.length()-1-i));
}
System.out.println(sb);
*/
 //TO REMOVE VOWELS FROM STRING BUILDER
 /*String str=s.nextLine();
StringBuilder sb=new StringBuilder(str);
for(int i=0;i<sb.length();i++){
    if(sb.charAt(i)== 'a' || sb.charAt(i)== 'e' || sb.charAt(i)== 'i' || sb.charAt(i)== 'o' || sb.charAt(i)== 'u' || sb.charAt(i)== 'A' || sb.charAt(i)== 'E' || sb.charAt(i)== 'I' || sb.charAt(i)== 'O' || sb.charAt(i)== 'U'){
        sb.deleteCharAt(i);
    }
}
System.out.println(sb);*/
// TO FORMAT THE STRING IN ALTERNATIVE CASE HeLloWoRlD
String str=s.nextLine();
StringBuilder sb=new StringBuilder(str);
for(int i=0;i<sb.length();i++){
    char ch=sb.charAt(i);
    if(i%2==0){
        sb.setCharAt(i,Character.toUpperCase(ch));
    }
    else{

         sb.setCharAt(i,Character.toLowerCase(ch));
} 
}
System.out.println(sb);
    
}
}
