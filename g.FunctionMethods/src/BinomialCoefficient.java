public class BinomialCoefficient {
    // ncr = n!/(r!(n-r)!)
    public  static int factorial(int n){
        int factorial = 1;
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        int n = 7;
        int r = 4;
        int binomialCoefficient = factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println(binomialCoefficient);
    }
}