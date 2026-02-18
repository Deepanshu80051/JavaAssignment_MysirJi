package Assigment3;

public class ReverseThreeDigit {
    public static void main(String[] args) {
        int a=135;
        int c= a%10*100 + a/10%10 * 10 + a/100;
        System.out.println(c);
    }
}
