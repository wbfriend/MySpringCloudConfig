package com.my.springcloud.feign.service;

import com.my.springcloud.api.common.util.ResultUtil;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "SPRINGCLOUD-COINFIG-DEPT",fallbackFactory = DeptFallbackFactoryError.class)
public interface DeptCleignService {

    @GetMapping("dept/get/{id}")
    ResultUtil getFindById(@PathVariable Integer id);
    @GetMapping("/dept/list/{page}/{pageSize}")
    ResultUtil selectDeptList(@PathVariable Integer page, @PathVariable Integer pageSize);
}
