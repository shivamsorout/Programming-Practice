public class BinarySearch {
    static int binarySearch(int[] arr, int num) {
        int first = 0, last = arr.length-1;
        while (first <= last) {
            int mid = first+(last-first)/2;
            if (arr[mid]==num) {
                return mid;
            }
            if (arr[mid]<num) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr = {2,3,4,5,6,7};
        int num = 5;
        System.out.println("Index of your num is :"+binarySearch(arr,num));
    }
}