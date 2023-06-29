import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter, how many line patter you want to print : ");
        int lines = sc.nextInt();
//        char ch=97; //for starting with small letter's
        char ch='A';
        for(int i=1; i<=lines; i++){
            for (int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}