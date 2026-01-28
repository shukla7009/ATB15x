package ex_12_Object;

public class Lab047_StringUtility {
    public static boolean containsLetter(String s){
        return s.contains("a") || s.contains("A");
    }
    public static void main(String[] args) {
        String Name1 = "adam";
        String Name2 = "jon";

        System.out.println(containsLetter( Name1));
        System.out.println(containsLetter(Name2));


        }
    }

