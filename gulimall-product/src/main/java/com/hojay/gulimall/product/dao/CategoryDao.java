package com.hojay.gulimall.product.dao;

import com.hojay.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author hojay
 * @email 923253757@qq.com
 * @date 2025-04-16 23:29:51
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
