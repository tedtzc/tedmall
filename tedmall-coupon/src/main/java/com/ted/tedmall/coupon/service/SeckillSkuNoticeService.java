package com.ted.tedmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ted.common.utils.PageUtils;
import com.ted.tedmall.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author ted
 * @email 393740960@qq.com
 * @date 2022-05-07 21:40:47
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

