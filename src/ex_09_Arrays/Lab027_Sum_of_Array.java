package ex_09_Arrays;

public class Lab027_Sum_of_Array {
    public static void main(String[] args) {
        int input[] = {10,20,30,40,50};
        int sum = 0;

        for (int i = 0; i< input.length; i++){
            sum = sum + input[i];
        }
        System.out.println(sum);

    }
}
