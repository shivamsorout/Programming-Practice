import java.util.Scanner;

public class HollowHourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n;i>=0;i--){
            for(int j=0; j<n*2;j++){
                if(i+j==n-1 || j-i==n-1 || i==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=0; j<n*2;j++){
                if(i+j==n-1 || j-i==n-1 || i==n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}