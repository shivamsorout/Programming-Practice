public class DecimalToBinary {

    public static void decimalToBinary(int decimalNumber){
        int binaryNumber = 0;
        int pow=0;
        int count=0;
        while(decimalNumber!=0){
            int remainder = decimalNumber%2;
            binaryNumber=(int)(binaryNumber+remainder*Math.pow(10,pow++));
            decimalNumber = decimalNumber/2;
        }
        System.out.println(binaryNumber);
    }
    public static void main(String[] args) {
        int decimalNumber = 8;
        decimalToBinary(decimalNumber);
    }
}