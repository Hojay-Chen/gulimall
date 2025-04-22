package com.hojay.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hojay.common.utils.PageUtils;
import com.hojay.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author hojay
 * @email 923253757@qq.com
 * @date 2025-04-21 23:25:45
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

