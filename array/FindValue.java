package array;

public class FindValue {
    public static void main(String[] args) {


        int[] marks = {45,23,34,65,78,23};
        int num = 45;
        boolean isInArray = false;
        for (int element : marks) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value is present in the array");
        } else {
            System.out.println("The value is not present in the array");
        }

    }

    }