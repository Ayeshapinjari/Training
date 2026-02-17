import java.math.BigInteger;
import java.util.*;
class Bigint{
    public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Total population: ");
BigInteger b1=new BigInteger(s.next());
BigInteger b2=new BigInteger(s.next());
BigInteger b3=new BigInteger(s.next());
System.out.println("Total population"+ b1.add(b2).add(b3));
    }
}