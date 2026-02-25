import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>(10);
        // by default hashmap size is 16
        map.put(0, "Ayesha");
        map.put(1, "Varshini");
        map.put(2, "Varshini");
        map.put(3, "Varshini");
        map.put(4, "Varshini");
        // System.out.println(map.get(0));
        // System.out.println(map.get(1));
        //System.out.println(map);
        int arr[]={1,2,3,2,3,1,1,3};
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i:arr){
            if(m.containsKey(i)){
                m.put(i, m.get(i)+1);// 2:2 3:2 1:2 1:3 3:3
            }
            else{
                m.put(i,1);// 1:1 2:1 3:1 
            }
        }
        System.out.println(m);
        
    }
}
