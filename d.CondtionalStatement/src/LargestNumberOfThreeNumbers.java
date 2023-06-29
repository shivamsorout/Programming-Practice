public class LargestNumberOfThreeNumbers {
    public static void main(String[] args) {
        int a=3;
        int b=5;
        int c=9;
        if(a>b && a>c){
            System.out.println("a is greater than b and c :"+a);
        }
        else if(b>a && b>c){
            System.out.println("b is greater than a and c :"+b);
        }
        else {
            System.out.println("C is greater than b and a :"+c);
        }
    }
}