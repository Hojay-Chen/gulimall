package com.hojay.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hojay.common.utils.PageUtils;
import com.hojay.gulimall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author hojay
 * @email 923253757@qq.com
 * @date 2025-04-21 23:39:17
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

