package com.hojay.gulimall.member.feign;

import com.hojay.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: CouponFeignService
 * Package: com.hojay.gulimall.member.feign
 * Description:
 *
 * @Author: 陈浩杰
 * @Create: 2025/4/22 - 9:32
 * @Version: v1.0
 */
@FeignClient("gulimall-coupon")
@Service
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}








