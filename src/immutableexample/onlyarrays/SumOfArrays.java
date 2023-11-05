package immutableexample.onlyarrays;

public class SumOfArrays {
    public static void main(String[] args) {
        /*float[] marks={2.4f,8.9f,7.6f,5.1f,4.3f};
        float sum=0;
        for (float element:
             marks) {
            sum=sum+element;
        }
        System.out.println("The value of sum is "+sum);*/
        /*float[] marks={2.4f,8.9f,7.6f,5.1f,4.3f};
        float searchFloat=5.1f;
        boolean result=false;
        for (float currentElement :
                marks) {
            if (searchFloat == currentElement) {
                result=true;
                break;
            }
        }
        if(result){
            System.out.println("The element "+searchFloat+" is present is the given array");
        }*/

       /* float[] marks={2.4f,8.9f,7.6f,5.1f,4.3f};
        float sum=0;
        for (float element:
                marks) {
            sum=sum+element;
        }
        System.out.println("The Average marks obtained is  "+sum/marks.length);*/

        int[] [] twoDimensionarray={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(twoDimensionarray.toString());
    }
}
