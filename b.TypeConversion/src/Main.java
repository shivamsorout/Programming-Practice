import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 9;
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
//        int number = sc.nextFloat(); //it is not compatible and here destination is less than source
        float number = sc.nextInt();
        System.out.println(number);
    }
}