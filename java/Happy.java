import java.util.*;
class Happy{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] e=s.split(" ");
        int sum=0;
        for (int i = 0; i < e.length; i++) {
            if(e[i].equals("=)") || e[i].equals("^_^") ){
                sum+=1;
            }
            else{
                sum-=1;
            }
        }
        System.out.println(sum);
    }
}