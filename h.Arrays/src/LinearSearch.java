import java.util.Scanner;

public class LinearSearch {

        public static void linearSearch(int [] arr, int n){
            int a=0;
            for(int i=0;i<arr.length;i++) {
                if(arr[i]==n){
                    a=1;
                }
            }
            if (a==1){
                System.out.println("Found");
            } else System.out.println("Not Found");
        }
        public static void main(String[] args) {
            int[] arr = {2,5,3,7,8};
            int n = 1;
            linearSearch(arr,n);
        }
    }