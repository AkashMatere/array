package array;

public class findDuplictes {
    public static void main(String[] args) {
        int arr[] = {23, 45, 56,34,45,56,54,23};
        int abm[]= new int[arr.length];
        int k=0;
        for (int i=0;i<8;i++) {
            for(int j=i+1;j<8;j++){

                if(arr[i]==arr[j]) {
                    abm[k]=arr[i];
                    k++;
                }
            }
        }
        for(int element:abm)
        {
            System.out.print(element+" ");
        }
    }
}
