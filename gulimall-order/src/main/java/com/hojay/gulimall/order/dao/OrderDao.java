package com.hojay.gulimall.order.dao;

import com.hojay.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hojay
 * @email 923253757@qq.com
 * @date 2025-04-21 23:39:17
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
