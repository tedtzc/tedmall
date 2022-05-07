package com.ted.tedmall.member.dao;

import com.ted.tedmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ted
 * @email 393740960@qq.com
 * @date 2022-05-07 21:52:14
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
