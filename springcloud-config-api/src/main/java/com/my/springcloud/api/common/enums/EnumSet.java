package com.my.springcloud.api.common.enums;

public enum EnumSet {
    /**
     * code = 0表示操作成功！；为1表示操作失败！
     */
    FEIGXERROR(-1,"熔断器异常处理统一出口"),
    SUCCESS(0,"操作成功"),
    FAILURE(1,"操作失败");
    private Integer code;
    private String msg;

    EnumSet(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }
}
