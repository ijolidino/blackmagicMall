package com.blackmagic.mall.product.vo;

import lombok.Data;

/**
 * Create by Fuwen on 2021/1/17
 */
@Data
public class AttrRespVo extends AttrVo{
    /**
     *
     */
    private String catelogName;

    private String groupName;

    private Long[] catelogPath;
}
