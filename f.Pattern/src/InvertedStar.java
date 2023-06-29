import java.util.Scanner;

public class InvertedStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter, how many line patter you want to print : ");
        int lines = sc.nextInt();
        for(int i=1; i<=lines; i++){
            for (int j=lines; j>=i; j--){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}