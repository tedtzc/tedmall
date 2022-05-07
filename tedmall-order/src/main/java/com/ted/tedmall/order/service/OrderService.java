package com.ted.tedmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ted.common.utils.PageUtils;
import com.ted.tedmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author ted
 * @email 393740960@qq.com
 * @date 2022-05-07 22:02:17
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

