import java.util.*;
class First{
    int a;
    String name;
    First(int n,String name){
        a=n;
        this.name=name;
    }
}

public class ArrObj {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int size=sc.nextInt();
       First obj[]=new First[size];
        for(int i=0;i<size;i++){
            int a=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            obj[i]=new First(a,name);
        }
        for(int i=0;i<size;i++){
            System.out.println(obj[i].a+" "+obj[i].name);
        }

       
    }
}
