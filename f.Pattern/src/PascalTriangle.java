import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(k==1 || k==i){
                    System.out.print(1+" ");
                }
                else {
                    System.out.print(i-1+" ");
                }
            }
            System.out.println();
        }
    }
}