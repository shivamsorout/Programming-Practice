public class TrippingRainWater {
    //Given n non-negative integers representing an elevation map where the width of each bar is 1,
    //Compute how much water it can trap after raining
    public static void trippingRainwater(int [] arr){

        int trapWater=0;
        for (int i=0;i< arr.length;i++){
            int leftMax = leftMaxBoundry(arr,i),
            rightMax = rightMaxBoundry(arr,i), minValue = Math.min(leftMax,rightMax);
            if(arr[i]<leftMax && arr[i]<rightMax){
                trapWater += (minValue-arr[i]);
            }
        }
        System.out.println(trapWater);
    }
    static int leftMaxBoundry(int arr[],int index){
        int leftMax=0;
        for(int i=0;i< index;i++){
            if(arr[i]>leftMax){
                leftMax=arr[i];
            }
        }
        return leftMax;
    }
    static int rightMaxBoundry(int arr[],int index){
        int rightMax=0;
        for(int i=index;i< arr.length;i++){
            if(arr[i]>rightMax){
                rightMax=arr[i];
            }
        }
        return rightMax;
    }
    public static void main(String[] args) {
        int [] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        trippingRainwater(arr);

        //time Complexity = O(n^2)
    }
}
