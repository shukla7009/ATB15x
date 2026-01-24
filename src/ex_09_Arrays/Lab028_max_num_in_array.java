package ex_09_Arrays;

public class Lab028_max_num_in_array {
    public static void main(String[] args) {
        int input[] = {65, 98, 78, 99, 12, 100, 56, 87};
        int max = input[0];
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }
        System.out.println(max);
    }
}
