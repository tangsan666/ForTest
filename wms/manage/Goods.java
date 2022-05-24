package com.wms.manage;

import com.wms.role.Supplier;

/**
 * 货物
 */
public class Goods {
    public static Goods goods_1 = new Goods(1, "男鞋", 52.0, Supplier.supplier_1.getSupplier_id());
    public static Goods goods_2 = new Goods(2, "女装", 100.0, Supplier.supplier_3.getSupplier_id());

    private int goods_id;
    private String goods_name;
    private double goods_price;
    private int supplier_id;

    public Goods(int goods_id, String goods_name, double goods_price, int supplier_id) {
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.goods_price = goods_price;
        this.supplier_id = supplier_id;
    }

    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }

    public Goods() {
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

    public double getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(double goods_price) {
        this.goods_price = goods_price;
    }
}
