// u are given n activities
// start time
//end time
// u must select the max non of overloading activities
class Activities{
    int start,end;
    public Activities(int start,int end) {
        this.start=start;
        this.end=end;
    }
    
    
}

public class Greedy{
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int size=start.length;
        int end[]={9,5,8,7,2,1};
    Activities obj[]=new Activities[size];
        for (int i = 0; i < size; i++) {
           obj[i]=new Activities(start[i],end[i]); 
        }
        for (int i = 0; i < size; i++) {
            System.out.println(obj[i].start+" "+obj[i].end);
        }

    }
}