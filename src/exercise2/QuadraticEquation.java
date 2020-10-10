package exercise2;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a= ");
        double a = input.nextDouble();
        System.out.print("Enter b= ");
        double b = input.nextDouble();
        System.out.print("Enter c= ");
        double c = input.nextDouble();
        double d = (b*b - 4*a*c);
        
        if (d>0) {
          System.out.println("x1= " + (-b + (Math.sqrt(d)) / (2*a)));
          System.out.println("x2= " + (-b - (Math.sqrt(d)) / (2*a)));
        } else if (d == 0) {
          System.out.println("x1 = x2 = " + (-b/(2*a)));
        } else {
          System.out.println("Imaginary values");
        }

    }

}