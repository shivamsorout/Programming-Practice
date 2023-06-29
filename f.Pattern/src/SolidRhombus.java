import java.util.Scanner;

public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter, how many line patter you want to print : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1; i<=n; i++){
            for (int j=m; j>=i; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}