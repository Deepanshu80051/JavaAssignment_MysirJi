package Assignment4_Decision;

public class EvenOddWithoutModulo {
    public static void main(String[] args) {
        int a=22;
//        if(a/2*2==a) System.out.println("even");

        if(((a&1)==0)) System.out.println("even");
        else System.out.println("odd");
    }
}
