package ex_07_loops;

public class Lab021_forLoop_useBreak {

    public static void main(String[] args) {
        int i = 1;
        for(i =1; i <= 10; i ++) {
            if (i == 6)
                break;
            System.out.println(i);
        }
    }
}
