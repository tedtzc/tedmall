package com.ted.tedmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ted.common.utils.PageUtils;
import com.ted.tedmall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author ted
 * @email 393740960@qq.com
 * @date 2022-05-07 22:02:18
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

