import java.util.Scanner;

public class PalindromicPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter, how many line patter you want to print : ");
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int s=n-1;s>=i;s--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}