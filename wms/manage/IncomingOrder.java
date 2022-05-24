package com.wms.manage;

import wms.manage.Order;

/**
 * 入库订单
 */
public class IncomingOrder extends Order {
    private int incoming_order_id;
    private int goods_id;
    private String goods_name;
    private int goods_number;
    private double goods_price;
    private String goods_type;
    private int supplier_id;
    private String supplier_name;
    private String supplier_phone;
    private String supplier_address;
    private int driver_id;
    private String order_status;
    private String create_time;
    private String complete_time;
    private int warehouse_id;
    private int common_administrator_id;

    public IncomingOrder() {
        super();
    }

    public IncomingOrder(int incoming_order_id, int goods_id, String goods_name, int goods_number, double goods_price,
                         String goods_type, int supplier_id, String supplier_name, String supplier_phone,
                         String supplier_address, int driver_id, String order_status, String create_time,
                         String complete_time, int warehouse_id, int common_administrator_id) {
        this.incoming_order_id = incoming_order_id;
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.goods_number = goods_number;
        this.goods_price = goods_price;
        this.goods_type = goods_type;
        this.supplier_id = supplier_id;
        this.supplier_name = supplier_name;
        this.supplier_phone = supplier_phone;
        this.supplier_address = supplier_address;
        this.driver_id = driver_id;
        this.order_status = order_status;
        this.create_time = create_time;
        this.complete_time = complete_time;
        this.warehouse_id = warehouse_id;
        this.common_administrator_id = common_administrator_id;
    }

    public int getIncoming_order_id() {
        return incoming_order_id;
    }

    public void setIncoming_order_id(int incoming_order_id) {
        this.incoming_order_id = incoming_order_id;
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

    public int getGoods_number() {
        return goods_number;
    }

    public void setGoods_number(int goods_number) {
        this.goods_number = goods_number;
    }

    public double getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(double goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_type() {
        return goods_type;
    }

    public void setGoods_type(String goods_type) {
        this.goods_type = goods_type;
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

    public String getSupplier_phone() {
        return supplier_phone;
    }

    public void setSupplier_phone(String supplier_phone) {
        this.supplier_phone = supplier_phone;
    }

    public String getSupplier_address() {
        return supplier_address;
    }

    public void setSupplier_address(String supplier_address) {
        this.supplier_address = supplier_address;
    }

    public int getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(int driver_id) {
        this.driver_id = driver_id;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getComplete_time() {
        return complete_time;
    }

    public void setComplete_time(String complete_time) {
        this.complete_time = complete_time;
    }

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public int getCommon_administrator_id() {
        return common_administrator_id;
    }

    public void setCommon_administrator_id(int common_administrator_id) {
        this.common_administrator_id = common_administrator_id;
    }
}
