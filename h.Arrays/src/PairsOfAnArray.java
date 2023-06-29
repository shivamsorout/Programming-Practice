import java.util.Arrays;

public class PairsOfAnArray {
        public static void pairsInAnArray(int [] arr){
            int totalPairs=0;
            for (int i=0;i< arr.length;i++){
                int curr = arr[i];
                for(int j=i+1;j<arr.length;j++){
                    System.out.print("("+curr+","+arr[j]+")");
                    totalPairs++;
                }
                System.out.println();
            }
            System.out.println("Total Number of Pairs :"+totalPairs);
        }
        public static void main(String[] args) {
            int[] arr = {2,4,6,8,10};
            pairsInAnArray(arr);
        }
    }