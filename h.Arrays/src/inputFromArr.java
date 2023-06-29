import java.util.Scanner;

public class inputFromArr {

        public static void takeInputAndPrint(int length){
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[length];
            for (int i=0;i<length;i++){
                arr[i] = sc.nextInt();
            }
            for(int ar:arr){
                System.out.print(ar+", ");
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int length = sc.nextInt();
            takeInputAndPrint(length);
        }
    }