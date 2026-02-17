import java.io.*;
class Str{
public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();//HeLlO -> hElLo
    String s1="";
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(Character.isUpperCase(c)){
            s1+=Character.toLowerCase(c);
        }
        else{
            s1+=Character.toUpperCase(c);
        }
        
    }
    /* 
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch>='A'&& ch<='Z'){ //toggle case 
          s1+=(char)(s.charAt(i)+32);  
        }
        else{
            s1+=(char)(s.charAt(i)-32);
        } 
    }
        */
    
   System.out.println(s1);
   System.out.println("\""+s1+"\"");






}
}