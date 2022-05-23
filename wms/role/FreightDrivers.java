package com.wms.role;

/**
 * 货运司机
 */
public class FreightDrivers {
    private int driver_id;
    private String driver_name;
    private String driver_phone;
    private int driver_age;
    private String driver_license;

    public FreightDrivers(int driver_id, String driver_name, String driver_phone, int driver_age, String driver_license) {
        this.driver_id = driver_id;
        this.driver_name = driver_name;
        this.driver_phone = driver_phone;
        this.driver_age = driver_age;
        this.driver_license = driver_license;
    }

    public int getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(int driver_id) {
        this.driver_id = driver_id;
    }

    public String getDriver_name() {
        return driver_name;
    }

    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getDriver_phone() {
        return driver_phone;
    }

    public void setDriver_phone(String driver_phone) {
        this.driver_phone = driver_phone;
    }

    public int getDriver_age() {
        return driver_age;
    }

    public void setDriver_age(int driver_age) {
        this.driver_age = driver_age;
    }

    public String getDriver_license() {
        return driver_license;
    }

    public void setDriver_license(String driver_license) {
        this.driver_license = driver_license;
    }
}
