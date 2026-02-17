class P{
    public static void main(String args[])
{
 int n=4;
 /*for(int i=0;i<n;i++){//0
    for(int j=0;j<n;j++){//0
        if((i%2==0) || (j%2==0)){// 
            System.out.print("* ");
        }
        else{
            System.out.print("  ");
        }    
    }
    System.out.println();
 }*/
/* 
for(int i=1;i<=n;i++){
    for(int j=1;j<=(2*i-1);j++){
        System.out.print("* ");
    }
 System.out.println(" ");

}
 */
/*
1
2 3
4 5 6
7 8 9 10
 */
/* 
int count=1;
for(int i=1;i<=n;i++){//1 2
    for(int j=1;j<=i;j++){// 2 
        System.out.print(count++ +" ");//1 2
    }
System.out.println(" ");

}*/
//0 3 8 15 24 35 48 
/* 
for(int i=1;i<=7;i++){
    System.out.print((i*i)-1+" ");
}
    */
   /*for (int i = 1; i <=n; i++) {
    if(i==1 || i==n){
        for(int k=1;k<=n;k++){
            System.out.print("* ");
        }
        System.out.println("  ");
        continue;
    }
      for (int j = 1; j <=n; j++) {
        if(j==1 || j==n){
            System.out.print("* ");
        }
        else{
            System.out.print("  ");
        }  
      }
      System.out.println(" ");
       
   }*/
  for(int i=1;i<=n;i++){
    for(int j=1;j<=n;j++){
        if(i==1 || i==n || j==1 || j==n){
            System.out.print("* ");
        }
        else{
            System.out.print("  ");
        }
    }
    System.out.println(" ");
  }
}

}
