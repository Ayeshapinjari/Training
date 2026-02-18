
import java.util.*;
public class Iterate {
    public static void main(String args[]){
       ArrayList<Integer> list=new ArrayList<>(); 
       list.add(10);
       list.add(20);
       list.add(30);
       list.add(40);
       // traverse arraylist and print value
       Iterator <Integer> it=list.iterator();
       while(it.hasNext()){
            System.out.print(it.next()+" ");
       }
       it=list.iterator(); // re intialised beacuse cursor is at 4 so has next goes to next value that gives false
       // to remove value 20
       while(it.hasNext()){
        Integer val=it.next();
        if(val==20){
            it.remove();
        }
       }
       System.out.println(list);
    }
}
