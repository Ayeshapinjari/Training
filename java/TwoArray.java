public class TwoArray {
    public static void main(String args[]){
        int a[][]={{1,2,3},{4,5,6}};
        int i,j;
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            
        }
        System.out.println();
        }
        for(j=0;j<a[0].length;j++){
            for(i=0;i<a.length;i++){
System.out.print(a[i][j]+" ");
            }
             System.out.println();
        }
        int c=0;
        for(i=0;i<a.length;i++){
            c+=a[i].length;
        }
         System.out.println("count"+c);
         int r[]=new int[a.length];
         for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                r[i]+=a[i][j];
            
        }
        System.out.println();
        }
        for(i=0;i<r.length;i++){
            
                System.out.print(r[i]+" ");
            
        }
          int col[]=new int[a[0].length];
        // int col[] = new int[a[0].length];

for (j = 0; j < a[0].length; j++) {
    for (i = 0; i < a.length; i++) {
        col[j] += a[i][j];
    }
}

        
        for(i=0;i<col.length;i++){
            
                System.out.print(col[i]+" ");
            
        }
    
    



    }

}
