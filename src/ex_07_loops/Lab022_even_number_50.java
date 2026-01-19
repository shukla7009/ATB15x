package ex_07_loops;

public class Lab022_even_number_50 {
    public static void main(String[] args) {

        System.out.println("The even numbers are - ");
        int i = 1;

        for (i=1; i<=50; i++){
            if (i % 2 != 0)
                continue;
            {

                System.out.println(i);
            }
        }
    }
}


