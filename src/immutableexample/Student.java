package immutableexample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class Student {
    private final String name;
    private final int regNo;
    private final Map<String, String> metadata;

    public Student(String name, int regNo, Map<String, String> metadata) {
        this.name = name;
        this.regNo = regNo;

        this.metadata = Collections.unmodifiableMap(metadata);
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public Map<String, String> getMetadata() {

        return Collections.unmodifiableMap(metadata);
    }

    public static void main(String[] args) {
        Map<String, String> metadata = new HashMap<>();
        metadata.put("one", "abc");
        metadata.put("two", "xyz");
        Student student = new Student("dhiraj", 1, metadata);
        System.out.println(student.getName() + " " + student.getRegNo() + " " + student.getMetadata());
        metadata.put("three", "pqr");
        System.out.println(student.getName() + " " + student.getRegNo() + " " + student.getMetadata());
        System.out.println("Student "+student.getMetadata());

    }
}
