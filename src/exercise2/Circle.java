package exercise2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("r= ");
        int number = input.nextInt();
        double a = Math.PI;
        System.out.println("Circumference = " + 2*(number)*(a));
        System.out.println("Area = " + (number)*(a*a));
    }

}
