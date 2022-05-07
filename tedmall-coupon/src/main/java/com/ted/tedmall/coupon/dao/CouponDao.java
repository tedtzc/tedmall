package com.ted.tedmall.coupon.dao;

import com.ted.tedmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ted
 * @email 393740960@qq.com
 * @date 2022-05-07 21:40:47
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
