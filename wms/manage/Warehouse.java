package com.wms.manage;

import com.wms.role.WarehouseKeeper;
/**
 * 仓库
 */
public class Warehouse {
    public static Warehouse warehouse_1;
    public static Warehouse warehouse_2;
    public static Warehouse warehouse_3;

    private int warehouse_id;
    private String warehouse_name;
    private String warehouse_address;
    private int warehouse_keeper_id;
    private String warehouse_keeper_name;

    public Warehouse(int warehouse_id, String warehouse_name, String warehouse_address, int warehouse_keeper_id, String warehouse_keeper_name) {
        this.warehouse_id = warehouse_id;
        this.warehouse_name = warehouse_name;
        this.warehouse_address = warehouse_address;
        this.warehouse_keeper_id = warehouse_keeper_id;
        this.warehouse_keeper_name = warehouse_keeper_name;
    }

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public String getWarehouse_name() {
        return warehouse_name;
    }

    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    public String getWarehouse_address() {
        return warehouse_address;
    }

    public void setWarehouse_address(String warehouse_address) {
        this.warehouse_address = warehouse_address;
    }

    public int getWarehouse_keeper_id() {
        return warehouse_keeper_id;
    }

    public void setWarehouse_keeper_id(int warehouse_keeper_id) {
        this.warehouse_keeper_id = warehouse_keeper_id;
    }

    public String getWarehouse_keeper_name() {
        return warehouse_keeper_name;
    }

    public void setWarehouse_keeper_name(String warehouse_keeper_name) {
        this.warehouse_keeper_name = warehouse_keeper_name;
    }

    public static void main(String[] args) {
        warehouse_1 = new Warehouse(1, "1号仓库", "新疆", WarehouseKeeper.keeper_1.getKeeper_id(), WarehouseKeeper.keeper_1.getKeeper_name());
        warehouse_2 = new Warehouse(2, "2号仓库", "甘肃", WarehouseKeeper.keeper_2.getKeeper_id(), WarehouseKeeper.keeper_2.getKeeper_name());
        warehouse_3 = new Warehouse(3, "3号仓库", "西藏", WarehouseKeeper.keeper_3.getKeeper_id(), WarehouseKeeper.keeper_3.getKeeper_name());
    }
}
