public class LinearSearch1 {

        public static int linearSearch(int [] arr, int n){
            for(int i=0;i<arr.length;i++) {
                if(arr[i]==n){
                    return i;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int[] arr = {2,5,3,7,8};
            int n = 1;
            int i=linearSearch(arr,n);
            if(i==-1){
                System.out.println("NOt Found");
            }else System.out.println("Your number is on position :"+i);
        }
    }