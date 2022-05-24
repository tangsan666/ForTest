package com.wms.manage;

/**
 * 仓库管理
 */
public class WarehouseManagement {
    public static WarehouseManagement warehouseManagement_1;
    public static WarehouseManagement warehouseManagement_2;
    public static WarehouseManagement warehouseManagement_3;

    private int warehouse_id;
    private int goods_id;
    private String operation_time;
    private double current_stock;
    private double max_stock;

    public WarehouseManagement(int warehouse_id, int goods_id, String operation_time, double current_stock, double max_stock) {
        this.warehouse_id = warehouse_id;
        this.goods_id = goods_id;
        this.operation_time = operation_time;
        this.current_stock = current_stock;
        this.max_stock = max_stock;
    }

    public double getMax_stock() {
        return max_stock;
    }

    public void setMax_stock(double max_stock) {
        this.max_stock = max_stock;
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

    public static void main(String[] args) {
        warehouseManagement_1 = new WarehouseManagement(Warehouse.warehouse_1.getWarehouse_id(), Goods.goods_1.getGoods_id(), "06:00-22:00", 900.0, 1000.0);
        warehouseManagement_2 = new WarehouseManagement(Warehouse.warehouse_2.getWarehouse_id(), Goods.goods_2.getGoods_id(), "06:00-22:00", 800.0, 830.0);
        warehouseManagement_3 = new WarehouseManagement(Warehouse.warehouse_3.getWarehouse_id(), Goods.goods_1.getGoods_id(), "06:00-22:00", 440.0, 500.0);
    }
}
