package com.wms.manage;

/**
 * 仓库
 */
public class Warehouse {
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
}
