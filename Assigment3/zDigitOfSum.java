package Assigment3;

public class zDigitOfSum {
    public static void main(String[] args) {
        int a=2345;
        int s=a%10 + a/10%10 + a/100%10 + a/1000;
        System.out.println(s);

    }
}
