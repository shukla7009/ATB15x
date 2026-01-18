package ex_07_loops;

public class Lab020_forLoop_odd_no {

    public static void main(String[] args) {

        int i = 1;

        for (i = 1 ; i <= 10; i++ ) {
            if (i % 2 ==  0)
            continue;
            {
                System.out.println(i);
            }
        }

    }
}
