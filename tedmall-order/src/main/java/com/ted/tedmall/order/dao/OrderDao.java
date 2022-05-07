package com.ted.tedmall.order.dao;

import com.ted.tedmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ted
 * @email 393740960@qq.com
 * @date 2022-05-07 22:02:17
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
