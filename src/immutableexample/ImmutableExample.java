package immutableexample;

public final class ImmutableExample {
    private final int empId;
    private final String empName;

    private final Address address;

    public ImmutableExample(int empId, String empName, Address address) {
        this.empId = empId;
        this.empName = empName;
        Address add = new Address();
        add.setAreaName(address.getAreaName());
        add.setCityname(address.getCityname());
        add.setDistrictName(address.getDistrictName());
        this.address = add;
        /*this.address = address;*/


    }

    public int getEmpId() {
        return empId;
    }

    public Address getAddress() {
        return address;
    }

    public String getEmpName() {
        return empName;
    }

    public static void main(String[] args) {
        Address address1 = new Address("waldhuni", "kalyan", "thane");
        System.out.println(address1.getAreaName());
        ImmutableExample immutableExample = new ImmutableExample(1, "Dhiraj", address1);

        System.out.println("Emp ID : " + immutableExample.empId + " Employee Name : " + immutableExample.empName
                + " Address " + immutableExample.getAddress().areaName + " " + immutableExample.getAddress().cityname
                + " " + immutableExample.getAddress().districtName
        );

        address1.setAreaName("new area");
        System.out.println("************************");
        System.out.println("Emp ID : " + immutableExample.empId + " Employee Name : " + immutableExample.empName
                + " Address " + immutableExample.getAddress().areaName + " " + immutableExample.getAddress().cityname
                + " " + immutableExample.getAddress().districtName
        );

    }
}
