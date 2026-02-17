import java.util.Scanner;

public class Condition {
     public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n>0){
            if(n>2 && n%2==0){
                System.out.println("composite");
            }
            else{
                System.out.println("odd");
            }
        }
        else{
            System.out.println("negative integer");
        }
}
}
