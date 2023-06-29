import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i<=m){
//            sum=sum+i;
            sum += i;
            i++;
        }
        System.out.println("Sum is :"+sum);
    }
}