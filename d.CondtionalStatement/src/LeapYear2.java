import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean leap = false;
        // if the year is divided by 4
        if(year%4==0){
            // if the year is divided by 100
            if(year%100==0){
                // if the year is divided by 4
                if(year%400==0){
                    leap=true;
                }else {
                    leap=false;
                }
            }else {
                leap=true;
            }
        } else {
            leap = false;
        }
        if(leap) {
            System.out.println("Leap Year");
        } else{
            System.out.println("Not a leap year");
        }
    }
}