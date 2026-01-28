package ex_12_Object;

public class Lab045_StaticNonStatic {
    public void ns(){
        System.out.println("Non-Static");
    }
    public static void main(String[] args) {

        Lab045_StaticNonStatic obj = new Lab045_StaticNonStatic();
        obj.ns();


    }
}
