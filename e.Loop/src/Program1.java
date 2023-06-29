import java.util.Scanner;

public class Program1 {

    //keep entering numbers till user enters a multiple of 10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n%10==0){
                System.out.println(n+" is multiple of 10: ");
                break;
            }
        }
    }
}