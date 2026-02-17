public class Diamond {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){//0<=2 1<=2 2<=2
            for(int j=0;j<=i;j++){//0<=0 0<1 1<=1 0<=2 1<=2 2<=2
                System.out.print("*");//  *
                                        //   * *
            }
            System.out.println("");
        }
        for(int i=n-1;i>0;i--){// 1
            for(int j=1;j<=i;j++){// 1<=1
                System.out.print("*");//* 
            }
            System.out.println("");
        }



    }
}
