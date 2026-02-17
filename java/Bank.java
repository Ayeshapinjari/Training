import java.util.*;
class BankAccount{
    //private int acno;
    private double  bal;
    BankAccount(double bal){
        //this.acno=acno;
        this.bal=bal;
    }
    void deposit(double bal){
        if(bal>0){
       this.bal+=bal;
       System.out.println("deposited: "+bal);}
    }
    void check(){
        System.out.println("total balance: "+bal);
    }
    double withdraw(double a){
        if(bal<0 || bal<a){
            System.out.println("insufficient balance");
            return 0;
        }
        else {
            bal=bal-a;
            return a;
        }
        
    }
}
public class Bank {
   public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("WELCOME TO PM BANK");
      System.out.println(" start ur account with by depositing min balance"); 
    double bal=s.nextDouble();
    BankAccount b=new BankAccount(bal);               
      //System.out.println("WELCOME TO PM BANK");
       while(true){
      System.out.println("1.Deposit amount");
      System.out.println("2.WithDraw amount");
      System.out.println("3.Check balance");
      System.out.println("4.Exit");
      int op=s.nextInt();
     
      switch(op){
            case 1 : System.out.println("enter amount to deposit"); 
                     double deposit_amount=s.nextDouble();
                     b.deposit(deposit_amount);
                     break;
            case 2 : System.out.println("enter amount to withdraw"); 
                     double withdraw_amount=s.nextDouble();
                     double balance=b.withdraw(2000);
                     System.out.println("withdrawl amount:"+balance);
                     break;
            case 3:  b.check();
                     break;
            case 4: System.out.println("THANK YOU !!");
                    System.exit(0);
            default:  System.out.println("invalid operation");
      }

      }
   } 
}

