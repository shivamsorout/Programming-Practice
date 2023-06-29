public class SubArrayOfArray {

    public static void subArray(int []arr , int start , int end ){
        System.out.print("[");
        for ( int i = start ; i <= end ; i++ ){
            System.out.print(arr[i]+",");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int []arr = {2,3,4,5};
        for(int i=0;i< arr.length;i++){
            for(int j=i;j< arr.length;j++){
                subArray(arr,i,j);
            }
            System.out.println();
        }
    }
}