import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        //Check Student pass or fail
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();;
        String result = marks>33?"pass":"fail";
        System.out.println(result);
    }
}