import java.util.*;
public class TwoD {
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int r=s.nextInt();
    int c=s.nextInt();
    int arr[][]=new int[r][c];
    for(int i=0;i<r;i++){// 0 1
        for(int j=0;j<c;j++){// 0 1 2
            arr[i][j]=s.nextInt();// 1 2 3
                                  // 4 5 6
        }
    }
    
    /*for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(arr[i][j]>max){
                max=arr[i][j];
            }
        }
    }
    System.out.println(max+" maximum element");*/
    // max in col
    int row[]=new int[r];
    for(int i=0;i<r;i++){
        int max=arr[0][i];
        for(int j=0;j<c;j++){
            if(arr[j][i]>max){
                max=arr[j][i];
            }
            
        }
        System.out.print(max+" ");
    }
    // row count
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            row[i]+=arr[i][j] ; // col count arr[j][i]
        }     
    }
    System.out.println(" ");

    for(int i=0;i<row.length;i++){
        System.out.print(row[i]+" ");
    }
    System.out.println(" ");
    //diagonal sum
    int sum=0;
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
             if(i==j){
                sum+=arr[i][j];
             }
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
             if(i==j){
                sum+=arr[i][j];
             }
        }
    }
    System.out.println(sum+" diagonal sum");
    for(int i=0;i<r;i++){
       
                System.out.print(arr[i][c-i-1]+" ");
        
    }
}
}
