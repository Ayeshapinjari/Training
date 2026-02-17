import java.util.*;
class Vote{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=0;
        int y=0;
        int z=0;
        while(true){
            System.out.println("Enter your age:");
            int age=s.nextInt();
            if(age<18 && age>0){
                System.out.println(" not eligible for vote");
                continue;
            }
            else if(age==-1){
                break;
            }
            else{
            System.out.println("Enter your candidate:");
            System.out.println("1.Party X");
            System.out.println("2.Party Y");
            System.out.println("3.Party Z");
            int party=s.nextInt();
            switch(party){
                case 1 -> x+=1;
                case 2 -> y+=1;
                case 3 -> z+=1;
                default -> System.out.println("invalid vote");
            }
        }
        }
        if(x==y&&x==z){
            System.out.println("draw");
            System.exit(0);
        }
        if(x>y && x>z){
            System.out.println("X wins");
        }
        else if(y>z){
            System.out.println("Y wins");
        }
        else {
            System.out.println("Z wins");
        }   
    }
}