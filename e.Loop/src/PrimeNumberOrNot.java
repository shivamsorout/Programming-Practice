import java.util.Scanner;

public class PrimeNumberOrNot {
    public static boolean isPrime(int number)
    {
        int count = 0;
        if(number==1){
            return false;
        }
        for (int i=2;i<=number/2;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==0){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean prime = isPrime(number);

        if(prime){
            System.out.println("prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}