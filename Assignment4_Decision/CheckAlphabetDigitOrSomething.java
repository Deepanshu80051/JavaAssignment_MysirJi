package Assignment4_Decision;

public class CheckAlphabetDigitOrSomething {
    public static void main(String[] args) {
        int a=2;

        if(a>='A' && a <='Z' || a>='a' && a<='z') System.out.println("alphabet");
        else if(a>=0 && a<=9) System.out.println("digit");
        else System.out.println("something else");
    }
}
