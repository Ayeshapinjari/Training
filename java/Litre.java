// no of l = 20
// no of d=150
// l/100km 13.33
//miles/gallons 17.64
// 1 km =0.6214 miles
// 1 l= 0.2642 gallons
import java.util.*;
public class Litre {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter no of liters: ");
    double l=sc.nextInt();
    System.out.println("enter distance: ");
    double d=sc.nextInt();
    double m=(l/d)*100;
    System.out.printf("Liters/100KM :%.2f", m);
    System.out.println(" ");
    double mile=d*0.6214;
    double gallon=l*0.2642;
    System.out.printf("miles/gallons: %.2f",mile/gallon); 
  }  
}
