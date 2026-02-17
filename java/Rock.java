import java.util.*;
public class Rock {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      String p1=s.nextLine().toLowerCase();
      String p2=s.nextLine().toLowerCase();
     // String r="rock";
      //String p="paper";
      //String sc="Scissors";
      if(p1.equals(p2)){
        System.out.println("Draw");
      }
      else if((p1.equals("rock") && p2.equals("paper"))||(p1.equals("paper") && p2.equals("scissors") )||(p1.equals("scissors") && p2.equals("rock"))){
        System.out.println("player 2 wins");
      }
      else {
        System.out.println("player 1 wins");
      }
      
      


    }
}
