package wms.administrator;

import com.wms.manage.Goods;
import com.wms.manage.IncomingOrder;

import wms.manage.Order;
import wms.manage.OutboundOrder;

import java.util.ArrayList;

/**
 * 普通管理员
 */
public class CommonAdministrator {
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

    public Order create_outbound_order(){    // 创建出库订单
        Order outboundOrder = new OutboundOrder();
        return outboundOrder;
    }

    public Order create_incoming_order(){    // 创建入库订单
        String sql= "insert ";
        Order incomingOrder = new IncomingOrder();
        return incomingOrder;
    }

    public ArrayList<com.wms.manage.Goods> get_goods(String goods_name, String supplier_name, String Goods_status,String incoming_time){  // 库存查询
        return new ArrayList<Goods>();
    }

    public void set_Goods_Status(Order order,String s){
        order.setStatus(s);
    }
}
