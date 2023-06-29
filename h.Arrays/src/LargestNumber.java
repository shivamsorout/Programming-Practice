public class LargestNumber {

        public static int largestNumber(int [] arr){
            int min=0;
            for(int i=0;i<arr.length;i++) {
                if(arr[i]<min){
                   min=arr[i];
                }
            }
            return min;
        }
        public static void main(String[] args) {
            int[] arr = {2,5,3,7,8};
            System.out.println("Largest Number is :"+largestNumber(arr));
        }
    }