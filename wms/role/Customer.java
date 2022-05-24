package com.wms.role;

/**
 * 客户
 */
public class Customer {
    public static Customer customer_1;
    public static Customer customer_2;
    public static Customer customer_3;

    private int customer_id;
    private String customer_name;
    private String customer_phone;
    private String customer_address;

    public Customer(int customer_id, String customer_name, String customer_phone, String customer_address) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_phone = customer_phone;
        this.customer_address = customer_address;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public static void main(String[] args) {
        customer_1 = new Customer(1, "吕布", "123123", "山东");
        customer_2 = new Customer(2, "貂蝉", "5343453", "陕西");
        customer_3 = new Customer(3, "小乔", "34532", "山西");
    }
}
