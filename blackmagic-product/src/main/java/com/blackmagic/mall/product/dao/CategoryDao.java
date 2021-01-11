package com.blackmagic.mall.product.dao;

import com.blackmagic.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tanfuwen
 * @email 1149864038@qq.com
 * @date 2021-01-10 15:47:14
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
