public class BinaryToDecimal {

    public static void binaryToDecimal(int binaryNumber){
        int decimalNumber = 0;
        int pow=0;
        while(binaryNumber!=0){
            int lastDigit = binaryNumber%10;
            decimalNumber = (int)(decimalNumber+lastDigit*Math.pow(2,pow++));
            binaryNumber = binaryNumber/10;
        }
        System.out.println(decimalNumber);
    }
    public static void main(String[] args) {
        int binaryNumber = 1010;
        binaryToDecimal(binaryNumber);
    }
}