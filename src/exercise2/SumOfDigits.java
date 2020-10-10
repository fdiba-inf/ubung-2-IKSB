package exercise2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Wählen Sie eine Zahl zwischen 0 und 999: ");  
        int number = input.nextInt();
        int a1 = number%10;
        int n = number/10;
        int a2 = n%10;
        int m = n/10;
        int a3 = m%10;
        System.out.println(a1 + a2 + a3);
    }

}