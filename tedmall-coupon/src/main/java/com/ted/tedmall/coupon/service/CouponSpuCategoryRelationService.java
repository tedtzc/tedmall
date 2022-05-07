package com.ted.tedmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ted.common.utils.PageUtils;
import com.ted.tedmall.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author ted
 * @email 393740960@qq.com
 * @date 2022-05-07 21:40:47
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

