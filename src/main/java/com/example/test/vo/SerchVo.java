/**
 * 作者:   郭青贤
 * 时间:   2020/7/20 9:13
 */
package com.example.test.vo;

public class SerchVo {
    private String code;
    private String name;
    private String statue;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }

    public SerchVo() {
    }

    public SerchVo(String code, String name, String statue) {
        this.code = code;
        this.name = name;
        this.statue = statue;
    }

    @Override
    public String toString() {
        return "SerchVo{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", statue='" + statue + '\'' +
                '}';
    }
}
