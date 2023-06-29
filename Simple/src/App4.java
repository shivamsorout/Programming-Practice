import java.util.Arrays;

public class App4
{
    //Second-Largest Number from an array
    public static void main(String[] args)
    {
        int arr [] = {10,43,27,98,75,59,191};

        Arrays.sort(arr);
        for (int i=0;i< arr.length;i++)
        {
            if(i == arr.length-2)
                System.out.println(arr[i]);
        }

    }
}