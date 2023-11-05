package immutableexample;

public class Address {
    String areaName;
    String cityname;
    String districtName;

    public Address() {
    }
    public Address(String areaName, String cityname, String districtName) {
        this.areaName = areaName;
        this.cityname = cityname;
        this.districtName = districtName;
    }

    public String getAreaName() {
        return areaName;
    }

    public String getCityname() {
        return cityname;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }


}
