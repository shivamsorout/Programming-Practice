public class TypePromotion2 {
    public static void main(String[] args) {
        short a = 5;
        byte b = 25;
        char c  = 'c';
        byte d = (byte)(a+b+c);
        System.out.println(d);
    }
}