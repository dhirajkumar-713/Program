package immutableexample.middleelement;

public class MiddleElement {
    public static void main(String[] args) {
        int[] intArray={1,6,5,2,4,7,9,4,6,7,9,7,5,8};
        if(intArray.length %2==0){
            System.out.println("The middle elements are");
            int x=intArray[(intArray.length/2)-1];
            System.out.println(x);
            int y=intArray[intArray.length/2];
            System.out.println(y);
        } else {
            int z=intArray[intArray.length-2];
            System.out.println("The middle element is ");
            System.out.println(z);
        }
    }
}
