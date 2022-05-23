package com.wms.manage;

/**
 * 仓库管理
 */
public class WarehouseManagement {
    private int warehouse_id;
    private int goods_id;
    private String operation_time;
    private double current_stock;

    public WarehouseManagement(int warehouse_id, int goods_id, String operation_time, double current_stock) {
        this.warehouse_id = warehouse_id;
        this.goods_id = goods_id;
        this.operation_time = operation_time;
        this.current_stock = current_stock;
    }

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getOperation_time() {
        return operation_time;
    }

    public void setOperation_time(String operation_time) {
        this.operation_time = operation_time;
    }

    public double getCurrent_stock() {
        return current_stock;
    }

    public void setCurrent_stock(double current_stock) {
        this.current_stock = current_stock;
    }
}
