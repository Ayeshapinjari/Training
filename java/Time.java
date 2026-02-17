import java.util.Scanner;

public class Time {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter time 1");
        String st1=s.nextLine();
        System.out.println("enter time 2");
        String st2=s.nextLine();
        String t1[]=st1.split(":");
        String t2[]=st2.split(":");
        int s1=3600*Integer.parseInt(t1[0])+60*Integer.parseInt(t1[1])+Integer.parseInt(t1[2]);
        int s2=3600*Integer.parseInt(t2[0])+60*Integer.parseInt(t2[1])+Integer.parseInt(t2[2]);
        System.out.println(Math.abs(s1-s2));


}
}
