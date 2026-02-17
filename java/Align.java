import java.util.*;
class Align{

    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        String p[]=st.split(",");
        String product=p[0];
        double price=Double.parseDouble(p[1]);
        int qty=Integer.parseInt(p[2]);
        System.out.printf("%-10s%12.2f%8d",product,price,qty);

    }
}