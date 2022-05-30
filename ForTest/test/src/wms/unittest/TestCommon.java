package wms.unittest;


import org.junit.Test;
import wms.administrator.CommonAdministrator;
import wms.administrator.People;
import wms.factory.Factory;
import wms.manage.Goods;
import wms.manage.IncomingOrder;
import wms.manage.OutboundOrder;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCommon {
    Factory f1 = new Factory();
    CommonAdministrator common =(CommonAdministrator)f1.creat_People("CommonAdministrator");
    @Test
    public void test(){
        System.out.println(common.getName());
        System.out.println(common.getId());
        System.out.println(common.getAge());
        System.out.println(common.getPhone());
        System.out.println(common.getPassword());
    }

    @Test
    public void test_CreateOder1(){

        ArrayList<IncomingOrder> listIn = new ArrayList<>();
        common.create_incoming_order(Goods.goods_1,listIn);

    }

    @Test
    public void test_CreateOrder2() {

        ArrayList<OutboundOrder> listOut = new ArrayList<>();
        common.create_outbound_order(Goods.goods_2, listOut);
    }

    @Test
    public void test_Check(){

        ArrayList<Goods> goodsArrayList = common.get_goods("男", "", "");
        Iterator<Goods> iterator = goodsArrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getGoods_name());
        }
    }
}
