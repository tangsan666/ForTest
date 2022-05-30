package wms.role;

import wms.administrator.People;

/**
 * 仓库管理员
 */
public class WarehouseKeeper extends People {
    public static WarehouseKeeper keeper_1 = new WarehouseKeeper(1, "张三", "11111111");;
    public static WarehouseKeeper keeper_2 = new WarehouseKeeper(2, "李四", "22222222") ;
    public static WarehouseKeeper keeper_3 = new WarehouseKeeper(3, "王五", "33333333");

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

