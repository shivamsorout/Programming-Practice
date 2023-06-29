public class ReverseOfNumber2 {
    public static void main(String[] args) {
        int number = 123;
        int rev=0;
        while (number!=0){
            int rem = number%10;
            rev = rem+rev*10;
            number = number/10;
        }
        System.out.println(rev);
    }
}