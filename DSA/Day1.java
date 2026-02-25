import java.util.*;
class Methods{
     Scanner sc=new Scanner(System.in);
    void reverse(){
      //rev with no built in
      System.out.println("reverse");
      String s=sc.nextLine();
      char s1[]=s.toCharArray();
      int l=0;
      int r=s1.length-1;
        while(l<r){
            char temp=s1[l];
            s1[l]=s1[r];
            s1[r]=temp;
            l++;
            r--;
        }
        System.out.println(String.valueOf(s1));
    }
    boolean isanagram(){
        System.out.println("anagram");
        int freq[]=new int[26];
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
        freq[a.charAt(i)-'a']++;
        freq[b.charAt(i)-'a']--;
    }
    for (int i = 0; i < freq.length; i++) {
        if(freq[i]!=0){
            return false;
        }
    }
    return true;
}
void v_c(){
    String s=sc.nextLine().toLowerCase();
    int v=0;
    int c=0;
    for (int i = 0; i < s.length(); i++) {
       if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
        v++;
       }
       else{
        c++;
       }
       System.out.println("vowels: "+v);
       System.out.println("const: "+c);
    }
}
void remove_dup(){
   String s=sc.nextLine();
    StringBuilder res=new StringBuilder();
    boolean seen[]=new boolean[26];
    for (int i = 0; i < s.length(); i++) {
        if(!seen[s.charAt(i)-'a']){
            seen[s.charAt(i)-'a']=true;
            res.append(s.charAt(i));
        }
    }
    System.out.println(res);
}
}

class Day1{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    Methods obj=new Methods();
    //obj.reverse();
    //System.out.println(obj.isanagram());
    //obj.v_c();
    obj.remove_dup();
    
    }
    }
