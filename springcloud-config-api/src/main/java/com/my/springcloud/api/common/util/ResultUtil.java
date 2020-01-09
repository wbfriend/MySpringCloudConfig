package com.my.springcloud.api.common.util;

import com.my.springcloud.api.common.enums.EnumSet;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ResultUtil {


    private Integer code = 0;
    private String msg = "操作成功！";
    private Object data;

    public ResultUtil() {
    }
    public ResultUtil(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public ResultUtil(Object data) {
        if(data instanceof EnumSet){
            EnumSet e = (EnumSet) data;
            this.code=e.getCode();
            this.msg = e.getMsg();
        }else{
            this.data = data;
        }
    }
    public ResultUtil(Object data, Integer total) {
        Map<String, Object> mapData = new HashMap<String, Object>();
        mapData.put("list", data);
        mapData.put("total", total);
        this.data = mapData;
    }

}
