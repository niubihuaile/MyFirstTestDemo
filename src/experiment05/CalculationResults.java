package experiment05;

public abstract class CalculationResults implements Calculator{
    public static void main(String[] args) {
        getProduct(4,4,(a,b) -> a*a+b*b);
    }
    public static void getProduct(int a,int b,Calculator calculator){
        int product = Calculator.app(a,b);
        System.out.println(product);
    }
}
