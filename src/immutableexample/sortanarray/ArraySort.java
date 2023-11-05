package immutableexample.sortanarray;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] mobNum={9,8,6,7,4,6,0,2,6,6};
        for (int i = 0; i < mobNum.length; i++) {
            for (int j = i+1; j < mobNum.length; j++) {
                if (mobNum[i]>mobNum[j]){
                    int temp=mobNum[i];
                    mobNum[i]=mobNum[j];
                    mobNum[j]=temp;
                }

            }

        }
        System.out.println(Arrays.toString(mobNum));
    }
}
