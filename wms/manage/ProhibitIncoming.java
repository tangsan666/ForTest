package com.wms.manage;

/**
 * 禁止入库
 */
public class ProhibitIncoming {
    private int prohibit_incoming_id;
    private int goods_id;
    private String goods_name;
    private int supplier_id;

    public ProhibitIncoming(int prohibit_incoming_id, int goods_id, int supplier_id) {
        this.prohibit_incoming_id = prohibit_incoming_id;
        this.goods_id = goods_id;
        this.supplier_id = supplier_id;
    }

    public int getProhibit_incoming_id() {
        return prohibit_incoming_id;
    }

    public void setProhibit_incoming_id(int prohibit_incoming_id) {
        this.prohibit_incoming_id = prohibit_incoming_id;
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

    public int getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }
}
