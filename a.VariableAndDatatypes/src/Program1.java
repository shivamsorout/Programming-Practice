import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil  = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float sum = pencil+pen+eraser;
        float gstCalculate = sum*18/100;
        float totalSum = sum+gstCalculate;
        System.out.println(totalSum);
    }
}