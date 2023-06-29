public class ReverseOfNumber {
    public static void main(String[] args) {
        int number = 123;
        int rev=0;
        while (number>0){
            if (number==0){
                break;
            }
            int rem = number%10;
            rev = rem+rev*10;
            number = number/10;
        }
        System.out.println(rev);
    }
}