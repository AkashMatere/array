package array;

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sddd = sc.nextLine();
        int arr[] = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int element : arr) {
            System.out.print(element + " ");
            sum = sum + element;
        }
        System.out.println(sum);
        System.out.println(sddd);
        float per = (
                sum / 5);
        System.out.println(per);
    }
}
