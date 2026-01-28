package ex_11_Strings_continue;

public class Lab036_StringCompare {
    public static void main(String[] args) {
        String s1 = "Naruto";
        String s2 = "Naruto";
        String s3 = new String("Naruto");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

    }
}
