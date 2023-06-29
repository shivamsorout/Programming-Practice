public class MaxSumOfSubArr {
    public static void maxSumOfSubArr(int [] arr){
//        int [] sum = new int[];
        int maxSum = 0;
        for(int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                int sum=0;
                for(int k=i;k< j;k++){
                    sum=sum+arr[k];
                }
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6};
        maxSumOfSubArr(arr);

        //time Complexity = O(n^3)
    }
}
