package array;

public class FindMax {
    public static void main(String[] args) {
        int [] arr = {100, 200, 3, 565, 5, 37, 67};
        int max = Integer.MIN_VALUE;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("the value of the maximum element in this array is: "+ max);
    }
}
