public class StrDemo {
 public static void main(String a[]){
    String s=new String("Ayesha");
   String s1="ayesha";
   StringBuilder sb=new StringBuilder(s1);
   sb.insert(1,"hi");// at index 1 hi will be inserted
   System.out.println(sb.capacity());
   System.out.println(sb);
   sb.replace(0,3,"abcde");// here only 012 indices are replace with n length of sub string  
   System.out.println(sb);
   sb.delete(1,5);// delete chars at 1 2 3 4 indexes
   System.out.println(sb);
   sb.reverse();// reverse
   System.out.println(sb);
   sb.reverse();
   sb.setCharAt(0, 'A');// only one char is replaced same way deleteCharAt reoves a char at specific index
   System.out.println(sb);


    
    

    
    
 }   
}
