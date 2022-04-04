package lab2;

import java.util.Arrays;

public class test {
    public static int[] BubbleSort(int[] arr) {
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
//        int arr[] = new int[]{1,6,2,2,5};
//        test.BubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(Double.isNaN(Math.sqrt(-1.0)));
    }
}