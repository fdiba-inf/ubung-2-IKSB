package exercise2;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Wählen Sie eine Zahl zwischen 1 und 7:  ");
        int day = input.nextInt();
          if (day==1) {
          System.out.print("Monday");
        } else if (day==2) {
          System.out.print("Tuesday");
        } else if (day==3) {
          System.out.println("Wednesday");
        }  else if (day==4) {
          System.out.print("Thursday");
        }  else if (day==5) {
          System.out.print("Friday");
        }  else if (day==6) {
          System.out.print("Saturday");
        }  else if (day==7) {
          System.out.print("Sunday");
        }
    }

}