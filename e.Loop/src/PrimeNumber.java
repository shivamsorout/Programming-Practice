import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        if(number==1){
            System.out.println("Not Prime");
        }
        for (int i=2;i<=number/2;i++){
            if(number%i==0){
                count++;
            }
        }
        System.out.println(count);
        if(count==0){
            System.out.println("Prime");
        } else{
            System.out.println("Not Prime");
        }
    }
}