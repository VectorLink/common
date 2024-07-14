package com.vectorlink.common.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PageModel<T> implements Serializable {
    private long number;
    private long size;
    private long total;
    private long pages;
    private List<T> data;

    public PageModel() {
        this.data = new ArrayList();
    }

    public PageModel(List<T> data) {
        this.data = data;
    }

    public void add(T element) {
        this.data.add(element);
    }

    public long getNumber() {
        return this.number;
    }

    public long getSize() {
        return this.size;
    }

    public long getTotal() {
        return this.total;
    }

    public long getPages() {
        return this.pages;
    }

    public List<T> getData() {
        return this.data;
    }

    public void setNumber(final long number) {
        this.number = number;
    }

    public void setSize(final long size) {
        this.size = size;
    }

    public void setTotal(final long total) {
        this.total = total;
    }

    public void setPages(final long pages) {
        this.pages = pages;
    }

    public void setData(final List<T> data) {
        this.data = data;
    }
}
