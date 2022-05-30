package wms.unittest;


import org.junit.Test;
import wms.administrator.CommonAdministrator;
import wms.administrator.SuperAdministrator;
import wms.factory.Factory;
import wms.manage.Goods;
import wms.manage.WarehouseManagement;

import java.util.ArrayList;
import java.util.Iterator;

public class TestSuperAdministrator {

    Factory f1 = new Factory();
    SuperAdministrator superAdministrator =(SuperAdministrator)f1.creat_People("SuperAdministrator");

    @Test
    public void test1(){
        ArrayList<Goods> goodsArrayList = superAdministrator.get_goods("男", "", "");
        Iterator<Goods> iterator = goodsArrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getGoods_name());
        }
    }
    @Test
    public void test2(){
        System.out.println(WarehouseManagement.warehouseManagement_1.getOperation_time());
        System.out.println(WarehouseManagement.warehouseManagement_1.getMax_stock());
        boolean b = superAdministrator.warehouse_manage(1, "07:00-18:00", 500);
        System.out.println(WarehouseManagement.warehouseManagement_1.getOperation_time());
        System.out.println(WarehouseManagement.warehouseManagement_1.getMax_stock());
    }

    @Test
    public void test3(){
        boolean prohibit_outbound = superAdministrator.create_prohibit_outbound(2, 1);

    }
}
