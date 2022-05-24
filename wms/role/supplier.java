package com.wms.role;

/**
 * 供应商
 */
public class Supplier {
    public static Supplier supplier_1;
    public static Supplier supplier_2;
    public static Supplier supplier_3;

    private int supplier_id;
    private String supplier_name;
    private String supplier_address;
    private String supplier_phone;

    public Supplier(int supplier_id, String supplier_name, String supplier_address, String supplier_phone) {
        this.supplier_id = supplier_id;
        this.supplier_name = supplier_name;
        this.supplier_address = supplier_address;
        this.supplier_phone = supplier_phone;
    }

    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getSupplier_name() {
        return supplier_name;
    }

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }

    public String getSupplier_address() {
        return supplier_address;
    }

    public void setSupplier_address(String supplier_address) {
        this.supplier_address = supplier_address;
    }

    public String getSupplier_phone() {
        return supplier_phone;
    }

    public void setSupplier_phone(String supplier_phone) {
        this.supplier_phone = supplier_phone;
    }

    public static void main(String[] args) {
        supplier_1 = new Supplier(1, "李白", "湖南", "26928165");
        supplier_2 = new Supplier(2, "杜甫", "湖北", "54345345");
        supplier_3 = new Supplier(3, "王昭君", "海南", "21237853");
    }
}
