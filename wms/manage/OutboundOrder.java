package wms.manage;

import wms.manage.Order;

/**
 * 出库订单
 */
public class OutboundOrder extends Order {
    private int outbound_order_id;
    private int goods_id;
    private String goods_name;
    private int goods_number;
    private double goods_price;
    private String goods_type;
    private int customer_id;
    private String customer_phone;
    private String customer_address;
    private int driver_id;
    private String order_status;
    private String create_time;
    private String complete_time;
    private int warehouse_id;
    private int common_administrator_id;



    public OutboundOrder() {
        super();
    }

    public OutboundOrder(String status, int outbound_order_id, int goods_id, String goods_name,
                         int goods_number, double goods_price, String goods_type, int customer_id,
                         String customer_phone, String customer_address, int driver_id, String order_status,
                         String create_time, String complete_time, int warehouse_id, int common_administrator_id) {
        super(status);
        this.outbound_order_id = outbound_order_id;
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.goods_number = goods_number;
        this.goods_price = goods_price;
        this.goods_type = goods_type;
        this.customer_id = customer_id;
        this.customer_phone = customer_phone;
        this.customer_address = customer_address;
        this.driver_id = driver_id;
        this.order_status = order_status;
        this.create_time = create_time;
        this.complete_time = complete_time;
        this.warehouse_id = warehouse_id;
        this.common_administrator_id = common_administrator_id;
    }

    public int getOutbound_order_id() {
        return outbound_order_id;
    }

    public void setOutbound_order_id(int outbound_order_id) {
        this.outbound_order_id = outbound_order_id;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public int getGoods_number() {
        return goods_number;
    }

    public void setGoods_number(int goods_number) {
        this.goods_number = goods_number;
    }

    public double getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(double goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_type() {
        return goods_type;
    }

    public void setGoods_type(String goods_type) {
        this.goods_type = goods_type;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public int getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(int driver_id) {
        this.driver_id = driver_id;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getComplete_time() {
        return complete_time;
    }

    public void setComplete_time(String complete_time) {
        this.complete_time = complete_time;
    }

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public int getCommon_administrator_id() {
        return common_administrator_id;
    }

    public void setCommon_administrator_id(int common_administrator_id) {
        this.common_administrator_id = common_administrator_id;
    }
}
