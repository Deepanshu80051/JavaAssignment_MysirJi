package Assignment4_Decision;

import java.util.Scanner;

public class Divisible5OrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int a=sc.nextInt();
        if(a%5==0) System.out.println("yes");
        else System.out.println("not");
    }
}
