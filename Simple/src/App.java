public class App
{
    public static void main(String[] args)
    {
        int arr [] = {10,43,27,98,75,59,191};

        int sum = arr[0];
        for (int i=1;i<arr.length;i++)
        {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}