package com.wms.manage;

/**
 * 禁止出库
 */
public class ProhibitOutbound {

    private int goods_id;
    private String goods_name;
    private int supplier_id;
    private String supplier_name;
    private int customer_id;
    private String customer_address;
    private int warehouse_id;

    public ProhibitOutbound(int goods_id, String goods_name, int supplier_id, String supplier_name, int customer_id, String customer_address, int warehouse_id) {
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.supplier_id = supplier_id;
        this.supplier_name = supplier_name;
        this.customer_id = customer_id;
        this.customer_address = customer_address;
        this.warehouse_id = warehouse_id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
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

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }
}
