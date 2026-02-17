import java.util.*;
public class Operation {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        String op=s.next();
    
        int res=switch(op){
            case "and" -> a&b;
            case "or" -> a|b;
            case "xor" -> a^b;
            default -> 0;
        };
        System.out.println(res);
        
    }
}
