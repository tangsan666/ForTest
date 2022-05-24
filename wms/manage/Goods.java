package com.wms.manage;

/**
 * 货物
 */
public class Goods {
    public static Goods goods1;
    public static Goods goods2;


    private int goods_id;
    private String goods_name;
    private double goods_price;
    private int supplier_id;

    public Goods(int goods_id, String goods_name, double goods_price) {
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.goods_price = goods_price;
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

    public static void main(String[] args) {
        Goods goods1 = new Goods();
        Goods goods2 = new Goods();
    }


}
