package com.wms.role;

/**
 * 仓库管理员
 */
public class WarehouseKeeper {
    private int keeper_id;
    private String keeper_name;
    private String keeper_phone;

    public WarehouseKeeper(int keeper_id, String keeper_name, String keeper_phone) {
        this.keeper_id = keeper_id;
        this.keeper_name = keeper_name;
        this.keeper_phone = keeper_phone;
    }

    public int getKeeper_id() {
        return keeper_id;
    }

    public void setKeeper_id(int keeper_id) {
        this.keeper_id = keeper_id;
    }

    public String getKeeper_name() {
        return keeper_name;
    }

    public void setKeeper_name(String keeper_name) {
        this.keeper_name = keeper_name;
    }

    public String getKeeper_phone() {
        return keeper_phone;
    }

    public void setKeeper_phone(String keeper_phone) {
        this.keeper_phone = keeper_phone;
    }
}
