 import java.util.*;
 class Car{
    String make;
    String model;
    int year;
    Car(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }
    void display(){
        System.out.println("MAKE COMPANY:"+make);
        System.out.println("CAR MODEL :"+model);
        System.out.println("YEAR:"+year);

    }

}
class Showroom{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter no of cars");
        int n=s.nextInt();
        s.nextLine();
        Car obj[]=new Car[n];
        for(int i=0;i<n;i++){
            String make=s.nextLine();
            String model=s.nextLine();
            //s.next();
            int year=s.nextInt();
            obj[i]=new Car(make,model,year);
            obj[i].display();
        }


    }
}