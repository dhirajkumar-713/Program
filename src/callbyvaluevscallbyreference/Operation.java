package callbyvaluevscallbyreference;

public class Operation {
    /*
    * There is only call by value in java, not call by reference.
    * If we call a method passing a value, it is known as call by value.
    * The changes being done in the called method, is not affected in the calling method
    * */
    int data=50;
    void setValue(int data){
        data=data+10;
    }

    public static void main(String[] args) {
        Operation operation=new Operation();
        System.out.println(operation.data);
        operation.setValue(20);
        System.out.println(operation.data);
    }
}
