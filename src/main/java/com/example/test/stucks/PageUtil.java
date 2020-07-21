/**
 * 作者:   郭青贤
 * 时间:   2020/7/20 9:38
 */
package com.example.test.stucks;

import sun.rmi.log.LogInputStream;

import java.util.List;

public class PageUtil<T> {
    private List<T> list;
    private long total;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public PageUtil() {
    }

    public PageUtil(List<T> list, long total) {
        this.list = list;
        this.total = total;
    }

    @Override
    public String toString() {
        return "PageUtil{" +
                "list=" + list +
                ", total=" + total +
                '}';
    }
}
