import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();

        if(income<500000){
            System.out.println("you do not have to pay any tax");
        } else if (income>500000 && income<1000000) {
            System.out.println("you will have to pay 20% tax, which is :" + income*20/100);
        } else{
            System.out.println("you have to pay 30% tax, which is :" + income*30/100);
        }
    }
}