package wms.administrator;


import wms.manage.*;
import wms.role.Customer;
import wms.role.Supplier;

import java.util.ArrayList;

/**
 * 超级管理员
 */
public class SuperAdministrator extends People{
    public boolean create_prohibit_outbound(int goods_id, int customer_id) {     // 创建禁止出库货物
        // select goods_id,goods_name,supplier_id from Goods where goods_id = goods_id
        Goods goods = new Goods();
        if (goods_id == Goods.goods_1.getGoods_id()) {
            goods = Goods.goods_1;
        } else if (goods_id == Goods.goods_2.getGoods_id()) {
            goods = Goods.goods_2;
        } else {
            return false;
        }
        // select customer_id from Goods where customer_id = customer_id
        Customer customer = new Customer();
        if (customer_id == Customer.customer_1.getCustomer_id()) {
            customer = Customer.customer_1;
        } else if (customer_id == Customer.customer_2.getCustomer_id()) {
            customer = Customer.customer_2;
        } else {
            return false;
        }
        // int supplier_id = goods.getSupplier_id();
        // select supplier_name from Supplier where supplier_id=supplier_id

        // select warehouse_id from OutboundOrder where goods_id = goods_id and customer_id = customer_id
        try {
            ProhibitOutbound prohibitOutbound = new ProhibitOutbound(goods.getGoods_id(), goods.getGoods_name(),
                    goods.getGoods_price(),goods.getSupplier_id(), Supplier.supplier_1.getSupplier_name(), customer_id,
                    customer.getCustomer_address(), Warehouse.warehouse_1.getWarehouse_id());
            System.out.println("货物id:" + prohibitOutbound.getGoods_id());
            System.out.println("货物名称:" + prohibitOutbound.getGoods_name());
            System.out.println("供应商id:" + prohibitOutbound.getSupplier_id());

            System.out.println("客户id" + prohibitOutbound.getCustomer_id());
            System.out.println("客户地址:" + prohibitOutbound.getCustomer_address());
            System.out.println("仓库id:" + prohibitOutbound.getWarehouse_id());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean create_prohibit_incoming(int goods_id) {     // 创建禁止入库货物
        return true;
    }

    public ArrayList<OutboundOrder> get_outbound_order() {  // 获取出库订单
        ArrayList<OutboundOrder> outboundOrderArrayList = new ArrayList<>();
        String sql = "select * from OutboundOrder";
        return outboundOrderArrayList;
    }

    public ArrayList<IncomingOrder> get_incoming_order() {  // 获取入库订单
        return null;
    }

    public boolean warehouse_manage(int warehouse_id, String operation_time, double max_stock) {     // 仓库管理
        // select warehouse_id,operation_time,max_stock from WarehouseManagement where warehouse_id = warehouse_id
        WarehouseManagement warehouse_management = new WarehouseManagement();
        if (warehouse_id == WarehouseManagement.warehouseManagement_1.getWarehouse_id()) {
            warehouse_management = WarehouseManagement.warehouseManagement_1;
        } else if (warehouse_id == WarehouseManagement.warehouseManagement_2.getWarehouse_id()) {
            warehouse_management = WarehouseManagement.warehouseManagement_2;
        } else if (warehouse_id == WarehouseManagement.warehouseManagement_3.getWarehouse_id()){
            warehouse_management = WarehouseManagement.warehouseManagement_3;
        }

        if (operation_time!=null){
            warehouse_management.setOperation_time(operation_time);
        }
        if ( max_stock !=-1 && max_stock > warehouse_management.getCurrent_stock()){
            warehouse_management.setMax_stock(max_stock);
        }
        if ( max_stock < warehouse_management.getCurrent_stock()){
            System.out.println("要修改的最大存量必须大于当前存量");
        }
        return true;
    }

    public ArrayList<Goods> get_goods(String goods_name, String supplier_name, String incoming_time) {  // 库存查询
        ArrayList<Goods> goodsArrayList = new ArrayList<>();
        if(Goods.goods_1.getGoods_name().contains(goods_name)){
            goodsArrayList.add(Goods.goods_1);
        }
        if(Goods.goods_2.getGoods_name().contains(goods_name)){
            goodsArrayList.add(Goods.goods_2);
        }
        return goodsArrayList;
    }
}
