import java.util.*;
class Lcm{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();//6
        int b=s.nextInt();// 4
        int lcm=a>b?a:b;//6
        while(true){
            if(lcm%a==0 && lcm%b==0){//
                System.out.print(lcm);//12%6==0 && 12%4==0
                break;
            }
            lcm++;//7 8 9 10 11 12 
        }
        
    }
}