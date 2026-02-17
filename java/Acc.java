
class Ex{
    private int a=10;
    int b=10;
    void display(){
     System.out.println(a);
    System.out.println(b);   
    }
}
class Acc{
    public static void main(String args[]){
        Ex e=new Ex();
       e.display();
    }
} 