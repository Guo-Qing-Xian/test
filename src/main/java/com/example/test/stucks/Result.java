/**
 * 作者:   郭青贤
 * 时间:   2020/7/20 9:30
 */
package com.example.test.stucks;

public class Result {
    private Integer code;
    private String msg;
    public static Result ok(){
        return new Result(200,"ok");
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Result() {
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
