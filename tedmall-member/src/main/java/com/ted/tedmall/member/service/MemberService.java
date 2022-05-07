package com.ted.tedmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ted.common.utils.PageUtils;
import com.ted.tedmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author ted
 * @email 393740960@qq.com
 * @date 2022-05-07 21:52:14
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

