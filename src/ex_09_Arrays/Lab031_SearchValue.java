package ex_09_Arrays;

public class Lab031_SearchValue {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        boolean found = false;

        for (int value : arr){
            if (value == 30) {
                found = true;
                System.out.println(value);
                break;

            }

        }

    }
}
