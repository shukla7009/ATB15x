package ex_12_Object;

public class Lab049_MixMethods {

    public static void showStatic(){
        System.out.println("This is static");
    }
    public void nonStatic(){
        System.out.println("This is non static");
    }
    public int doubleValue(int x){
        return x * 2;
    }
    public static String welcomeMessage(){
        return "welcome Kakashi";
    }
    public static void main(String[] args) {
        showStatic();

        Lab049_MixMethods obj = new Lab049_MixMethods();
        obj.nonStatic();

        int twice = obj.doubleValue(9);
        System.out.println("double value - " + twice );

        System.out.println(welcomeMessage());
    }
}
