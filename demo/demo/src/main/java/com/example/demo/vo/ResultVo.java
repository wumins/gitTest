package com.example.demo.vo;

public class ResultVo {

    //返回码
    private int code;

    //返回值
    private Object result;

    public ResultVo() {
    }

    public ResultVo(int code, Object result) {
        this.code = code;
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
