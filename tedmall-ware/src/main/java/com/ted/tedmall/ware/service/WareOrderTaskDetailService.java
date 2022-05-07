package com.ted.tedmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ted.common.utils.PageUtils;
import com.ted.tedmall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author ted
 * @email 393740960@qq.com
 * @date 2022-05-07 22:07:05
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

