package functionalinterface;

/* functional Interface is an interface which has only 1  abstract method.
 *  functional Interface can have more than 1 static or default method.
 * */
@FunctionalInterface
public interface FirstFunctionalInterface {
    public void sayHello();

    default void sayGoodBye() {
        System.out.println("Good Bye !!!");
    }

    static void sayTakeCare() {
        System.out.println("Take Care as this is an static method");
    }



}
