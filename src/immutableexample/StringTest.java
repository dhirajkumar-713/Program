package immutableexample;

public class StringTest {
    public static void main(String[] args) {
        String s1=new String("a");
        String s2=new String("a");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        String s3="b";
        String s4="b";
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);
    }
}
