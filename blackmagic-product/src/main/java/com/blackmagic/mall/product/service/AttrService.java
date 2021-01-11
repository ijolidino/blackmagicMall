package com.blackmagic.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blackmagic.commons.utils.PageUtils;
import com.blackmagic.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author tanfuwen
 * @email 1149864038@qq.com
 * @date 2021-01-10 15:47:14
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

