package wms.administrator;


import wms.manage.Goods;
import wms.manage.IncomingOrder;
import wms.manage.OutboundOrder;

import java.util.ArrayList;

/**
 * 普通管理员
 */
public class CommonAdministrator extends People{
    private int id;
    private String name;
    private int age;
    private String phone;
    private String password;


    public CommonAdministrator(int id, String name, int age, String phone, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void create_outbound_order(Goods goods,ArrayList<OutboundOrder> list){    // 创建出库订单
        OutboundOrder out1 = new OutboundOrder();
        list.add(out1);
    }

   public void create_incoming_order(Goods goods,ArrayList<IncomingOrder> list){    // 创建入库订单
        IncomingOrder in1 = new IncomingOrder();
        list.add(in1);

    }

    public ArrayList<Goods> get_goods(String goods_name, String supplier_name, String incoming_time) {  // 库存查询
        ArrayList<Goods> goodsList = new ArrayList<>();
        if(Goods.goods_1.getGoods_name().contains(goods_name)){
            goodsList.add(Goods.goods_1);
        }
        if(Goods.goods_2.getGoods_name().contains(goods_name)){
            goodsList.add(Goods.goods_2);
        }
        return goodsList;
    }
}
