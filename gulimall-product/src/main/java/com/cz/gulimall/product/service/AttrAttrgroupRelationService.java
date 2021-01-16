package com.cz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cz.common.utils.PageUtils;
import com.cz.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author chenzhan
 * @email 1412473755@qq.com
 * @date 2021-01-16 21:19:48
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

