package wms.unittest;


import org.junit.Test;
import wms.factory.Factory;
import wms.role.Customer;
import wms.role.FreightDrivers;
import wms.role.Supplier;
import wms.role.WarehouseKeeper;

public class Test_Role {
    Factory f1 = new Factory();

    @Test
    public void test_Customer() {
        Customer c1 =(Customer)f1.creat_People("Customer");
        System.out.println(c1.getCustomer_name());
        System.out.println(c1.getCustomer_id());
        System.out.println(c1.getCustomer_phone());
        System.out.println(c1.getCustomer_address());
    }

    @Test
    public void test_Dirver() {
        FreightDrivers d1 =(FreightDrivers) f1.creat_People("FreightDrivers");
        System.out.println(d1.getDriver_name());
        System.out.println(d1.getDriver_id());
        System.out.println(d1.getDriver_age());
        System.out.println(d1.getDriver_license());
        System.out.println(d1.getDriver_phone());
    }

    @Test
    public void test_Supplier() {
        Supplier s1 =(Supplier) f1.creat_People("Supplier");
        System.out.println(s1.getSupplier_name());
        System.out.println(s1.getSupplier_id());
        System.out.println(s1.getSupplier_address());
        System.out.println(s1.getSupplier_phone());
    }

    @Test
    public void test_WarehouseKeeper() {
       WarehouseKeeper w1 =(WarehouseKeeper) f1.creat_People("WarehouseKeeper");
        System.out.println(w1.getKeeper_name());
        System.out.println(w1.getKeeper_id());
        System.out.println(w1.getKeeper_phone());
    }

}
