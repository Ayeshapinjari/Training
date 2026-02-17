public class Bit {
    public static void main(String args[]){
        int n=7;
        // decimal to binary
        int b[]=new int[32];
        int i=0;
        while(n>0){
            b[i++]=n%2;
            n=n/2;
        }
        System.out.println("Bit 4: "+b[3]);
        System.out.println("Bit 16: "+b[15]);
        System.out.println("Bit 32: "+b[31]);
    }
}
