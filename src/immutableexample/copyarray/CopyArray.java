package immutableexample.copyarray;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] integerArray={1254,234,987,765,987,273,846,625};
        int lengthOfOriginalArray=integerArray.length;
        System.out.println("The length of Array is "+lengthOfOriginalArray);
        int[] targetArray=new int[lengthOfOriginalArray];
        for (int i = 0; i < lengthOfOriginalArray; i++) {
            targetArray[i]=integerArray[i];
        }
        System.out.println(Arrays.toString(targetArray));
    }
}
