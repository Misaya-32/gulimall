package com.cz.gulimall.product.dao;

import com.cz.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenzhan
 * @email 1412473755@qq.com
 * @date 2021-01-16 21:19:48
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
