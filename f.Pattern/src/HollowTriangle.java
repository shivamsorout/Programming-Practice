import java.util.Scanner;

public class HollowTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter, how many line patter you want to print : ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for (int j=0; j<n*2-1; j++){
                if(i+j==n-1 || j-i==n-1 || i==n-1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}