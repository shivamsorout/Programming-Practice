import java.util.Scanner;

public class LeapYear1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean x = year%4==0;
        boolean y = year%100!=0;
        boolean z = ((year%100==0) && (year%400==0));
        if(x && (y || z)) {
            System.out.println("Leap Year");
        } else{
            System.out.println("Not a leap year");
        }
    }
}