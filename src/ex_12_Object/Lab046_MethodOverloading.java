package ex_12_Object;

public class Lab046_MethodOverloading {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int Sum = add(10, 20);
        System.out.println("Integer Sum is - " + Sum);


        double Sum2 = add(199999, 89898989);
        System.out.println("Double Sum is - " + Sum2);

        int Sum3 = add(11,12,13);
        System.out.println("Triple integer Sum is - " + Sum3);
    }
}