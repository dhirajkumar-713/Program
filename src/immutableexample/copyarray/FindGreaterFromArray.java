package immutableexample.copyarray;

import java.util.Arrays;

public class FindGreaterFromArray {
    public static void main(String[] args) {
        int[] array={9,8,6,7,4,6,0,2,6,6};
        int[] result=new int[8];
        int count=0;
        for (int i = 1; i < array.length-1; i++) {
            if (array[i]>array[i-1] && array[i]>array[i+1]){
                result[count]=array[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
