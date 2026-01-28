package ex_12_Object;

public class Lab048_Calculator {
    public static int add(int a, int b){
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static double div(double a, double b){
        return a/b;
    }
    public static void main(String[] args) {
        int sum = add(23,22);
        System.out.println("addition - "+ sum);

        int pro = mul(10,10);
        System.out.println("Multiplication - " + pro);

        int minus = sub(100, 99);
        System.out.println("Subtraction - " + minus);

        double rem = div(30,7);
        System.out.println("Division - "+ rem);
    }
}
