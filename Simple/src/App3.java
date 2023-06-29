public class App3
{
    //Maximum number from array
    public static void main(String[] args)
    {
        int arr [] = {10,43,27,98,75,59,191};

        int max = arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}