import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {

        public static void reverseArray(int [] arr){
            int start=0, end = arr.length-1;
            while(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        public static void main(String[] args) {
            int[] arr = {2,5,3,7,8};
            reverseArray(arr);
            System.out.println(Arrays.toString(arr));
        }
    }