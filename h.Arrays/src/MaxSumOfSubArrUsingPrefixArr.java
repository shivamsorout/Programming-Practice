public class MaxSumOfSubArrUsingPrefixArr {
    public static void maxSumOfSubArr(int [] arr){
//        int [] sum = new int[];
        int maxSum = 0;
        int currSum = Integer.MAX_VALUE;
        int prefixArr[] = new int[arr.length];
        prefixArr[0]=arr[0];
        for(int i=1;i<prefixArr.length;i++){
            prefixArr[i] = prefixArr[i-1]+arr[i];
        }
        for(int i=0;i< arr.length;i++){
            for (int j=i;j< arr.length;j++){
                currSum=0;
                currSum = i==0?prefixArr[j]:prefixArr[j]-prefixArr[i-1];
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int [] arr = {1,-2,6,-1,3};
        maxSumOfSubArr(arr);

        //time Complexity = O(n^2)
    }
}
