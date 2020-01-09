package com.my.springcloud.feign.service;

import com.my.springcloud.api.common.enums.EnumSet;
import com.my.springcloud.api.common.util.ResultUtil;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class DeptFallbackFactoryError implements FallbackFactory<DeptCleignService> {
    @Override
    public DeptCleignService create(Throwable cause) {
        return new DeptCleignService() {
            @Override
            public ResultUtil getFindById(Integer id) {

                return new ResultUtil(EnumSet.FEIGXERROR);
            }

            @Override
            public ResultUtil selectDeptList(Integer page, Integer pageSize) {
                return new ResultUtil(EnumSet.FEIGXERROR);
            }
        };
    }
}
