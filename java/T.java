class InvalidageException extends RuntimeException{
    InvalidageException(String msg){
    super(msg);
    }
}
public class T {
    public static void checkage(int age) throws InvalidageException{ // THROWS AT METHOD SIGNATURE
        if(age<18){
            throw new InvalidageException("invalid age");// THROW INSIDE METHOD
        }
        else{
            System.out.println("VAlid");
        }
    }
    public static void main(String args[]){
        checkage(0);
    

}
}
