package com.hojay.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hojay.common.utils.PageUtils;
import com.hojay.gulimall.coupon.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author hojay
 * @email 923253757@qq.com
 * @date 2025-04-21 23:06:06
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

