package generalexample;

public class InheritanceTest {
    void printOne(Object object) {
        System.out.println("Print Object");
    }
    void printOne(String str){
        System.out.println("Print Str");
    }


    public static void main(String[] args) {
        InheritanceTest inheritanceTest=new InheritanceTest();
        inheritanceTest.printOne(null);
    }
}
