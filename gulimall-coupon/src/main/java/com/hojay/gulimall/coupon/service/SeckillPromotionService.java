package com.hojay.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hojay.common.utils.PageUtils;
import com.hojay.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author hojay
 * @email 923253757@qq.com
 * @date 2025-04-21 23:06:07
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

