package com.wms.administrator;

import com.wms.manage.Goods;
import com.wms.manage.IncomingOrder;

import wms.manage.OutboundOrder;

import java.util.ArrayList;

/**
 * 超级管理员
 */
public class SuperAdministrator {
    private boolean create_prohibit_outbound(int goods_id){     // 创建禁止出库货物
        return true;
    }

    private boolean create_prohibit_incoming(int goods_id){     // 创建禁止入库货物
        return true;
    }

    private ArrayList<OutboundOrder> get_outbound_order(){  // 获取出库订单
        return null;
    }

    private ArrayList<IncomingOrder> get_incoming_order(){  // 获取入库订单
        return null;
    }

    private boolean warehouse_manage(int warehouse_id){     // 仓库管理
        return true;
    }

    private ArrayList<Goods> get_goods(String goods_name, String supplier_name, String incoming_time){  // 库存查询
        return null;
    }
}
