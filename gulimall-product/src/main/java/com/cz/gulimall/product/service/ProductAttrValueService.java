package com.cz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cz.common.utils.PageUtils;
import com.cz.gulimall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author chenzhan
 * @email 1412473755@qq.com
 * @date 2021-01-16 21:19:48
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

