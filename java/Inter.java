interface Shape{
   public double area();
}
class Circle implements Shape{
    int r;
    Circle(int r){
this.r=r;
    }
    public double area(){
        return (3.14*r*r);
    }
}
class Rectangle implements Shape{
    int l,b;
    Rectangle(int l,int b ){
this.l=l;
this.b=b;
    }
    public double area(){
        return l*b;
    }
} 
class Inter{
    public static void main(String args[]){
        Shape c=new Circle(1);
        Shape r=new Rectangle(2,4);
        double a=c.area();
        double b=r.area();
        System.out.println(a+" "+b);
    }
}
