package ex_09_Arrays;

public class Lab030_ForEachMinValue {
    public static void main(String[] args) {
        int arr[] = {10,20,2,30,40,50};
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
                System.out.println(min);
            }

        }

    }
}