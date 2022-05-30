package wms.factory;

import wms.administrator.CommonAdministrator;
import wms.administrator.People;
import wms.administrator.SuperAdministrator;
import wms.role.Customer;
import wms.role.FreightDrivers;
import wms.role.Supplier;
import wms.role.WarehouseKeeper;

public class Factory {
    public People creat_People(String s){
        People people = null;
        if (s.equals("CommonAdministrator")){
            people = new CommonAdministrator(20,"王一",25,"199456123789",
                    "wy123");

        }else if(s.equals("SuperAdministrator")){
            people = new SuperAdministrator();

        }else if(s.equals("Customer")){
            people = new Customer(1, "吕布", "123123", "山东");;

        }else if(s.equals("FreightDrivers")){
            people = new FreightDrivers(1, "大乔", "1616510", 30, "A");

        }else if(s.equals("Supplier")){
            people = new Supplier(1, "李白", "湖南", "26928165");

        }else if(s.equals("WarehouseKeeper")){
            people = new WarehouseKeeper(1, "张三", "11111111");

        }
        return people;
    }
}
