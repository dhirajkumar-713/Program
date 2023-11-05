package streamspractical;

public class MaharashtraPopulation {
    private int idNo;
    private String firstName;
    private String lastName;
    private double salary;

    public MaharashtraPopulation(int idNo, String firstName, String lastName, double salary) {
        this.idNo = idNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
