import java.util.Scanner;

public class Program3 {
    //Write a program that reads a set of integers,and then prints the sum of the even and odd integers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        for (int i=0;i<10;i++){
            int n=sc.nextInt();
            if(n%2==0){
                even = even+n;
            }else {
                odd = odd+n;
            }
        }
        System.out.println("Sum of even number is : "+even);
    }
}