class InvalidageException extends Exception{ // checked exception so exception class
    InvalidageException(String msg){
    super(msg);
    }
}
public class Check {
    public static void checkage(int age) throws InvalidageException{ // THROWS AT METHOD SIGNATURE
        if(age<18){
            throw new InvalidageException("invalid age");// THROW INSIDE METHOD
        }
        else{
            System.out.println("VAlid");
        }
    }
    public static void main(String args[]){
    try{ // checked so we need to handle using try or catch
        checkage(16);
    }   
    catch(InvalidageException e){
        System.out.println(e.getMessage());
    } 

}
}
