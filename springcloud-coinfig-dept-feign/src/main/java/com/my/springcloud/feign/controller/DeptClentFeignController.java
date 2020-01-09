package com.my.springcloud.feign.controller;

import com.my.springcloud.api.common.util.ResultUtil;
import com.my.springcloud.feign.service.DeptCleignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/feign")
public class DeptClentFeignController {

    @Autowired
    private DeptCleignService deptCleignService;

    @GetMapping("/get/{id}")
    public ResultUtil get(@PathVariable Integer id){
        return deptCleignService.getFindById(id);
    }
    @GetMapping("/list/{page}/{pageSize}")
    public ResultUtil list(@PathVariable Integer page,@PathVariable Integer pageSize){
        return deptCleignService.selectDeptList(page,pageSize);
    }
}
