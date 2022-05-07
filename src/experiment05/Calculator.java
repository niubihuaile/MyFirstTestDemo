package experiment05;
@FunctionalInterface
public interface Calculator {
    public abstract double calculate(int a,int b);
    public default int subtract(int a, int b){
        return a-b ;
    }
    public default int add(int a,int b){
        return a + b;
    }
    public static int app(int a,int b) {
        return a*a+b*b;
    }
}
