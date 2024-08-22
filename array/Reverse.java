package array;

public class Reverse {
    public static void main(String[] args) {


        int[] arr = {12, 43, 21, 32, 34};
        //int aa[];
        for (int i = 0; i < 5; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int j = 4; j >= 0; j--) {

            System.out.print(arr[j] + " ");
        }
    }
}