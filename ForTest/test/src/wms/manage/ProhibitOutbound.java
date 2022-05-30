package wms.manage;

/**
 * 禁止出库
 */
public class ProhibitOutbound extends Goods{
    private int customer_id;
    private String customer_address;
    private int warehouse_id;
    public ProhibitOutbound() {
        super();
    }

    public ProhibitOutbound(int goods_id, String goods_name, double goods_price, int supplier_id, String type,
                            int customer_id, String customer_address, int warehouse_id) {
        super(goods_id, goods_name, goods_price, supplier_id, type);
        this.customer_id = customer_id;
        this.customer_address = customer_address;
        this.warehouse_id = warehouse_id;
    }

    public ProhibitOutbound(int goods_id, String goods_name, double goods_price, int supplier_id, String type) {
        super(goods_id, goods_name, goods_price, supplier_id, type);
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public int getSupplier_id() {
        return super.getSupplier_id();
    }

    @Override
    public void setSupplier_id(int supplier_id) {
        super.setSupplier_id(supplier_id);
    }

    @Override
    public int getGoods_id() {
        return super.getGoods_id();
    }

    @Override
    public void setGoods_id(int goods_id) {
        super.setGoods_id(goods_id);
    }

    @Override
    public String getGoods_name() {
        return super.getGoods_name();
    }

    @Override
    public void setGoods_name(String goods_name) {
        super.setGoods_name(goods_name);
    }

    @Override
    public double getGoods_price() {
        return super.getGoods_price();
    }

    @Override
    public void setGoods_price(double goods_price) {
        super.setGoods_price(goods_price);
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }
}
