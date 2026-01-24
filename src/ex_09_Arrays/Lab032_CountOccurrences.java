package ex_09_Arrays;

public class Lab032_CountOccurrences {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,2,2,2,3,4,5,6,7,22,2,8};
        int count = 0;
        for (int value : arr){
            if (value == 2){
                count++;
            }
        }
        System.out.println(count);
    }
}
