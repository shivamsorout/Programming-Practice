import java.util.Scanner;

public class Program2 {

    //keep entering numbers till user enters a multiple of 10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }
    }
}