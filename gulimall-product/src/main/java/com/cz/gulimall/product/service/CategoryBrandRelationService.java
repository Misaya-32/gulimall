package com.cz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cz.common.utils.PageUtils;
import com.cz.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author chenzhan
 * @email 1412473755@qq.com
 * @date 2021-01-16 21:19:48
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

