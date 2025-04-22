package com.hojay.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hojay.common.utils.PageUtils;
import com.hojay.gulimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author hojay
 * @email 923253757@qq.com
 * @date 2025-04-21 23:39:17
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

