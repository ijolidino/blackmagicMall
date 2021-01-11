package com.blackmagic.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blackmagic.commons.utils.PageUtils;
import com.blackmagic.mall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author tanfuwen
 * @email 1149864038@qq.com
 * @date 2021-01-10 15:47:14
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

