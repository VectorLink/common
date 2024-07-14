package com.vectorlink.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PageResult<T> extends BasicResult {
    private PageResult.Page page = new PageResult.Page();
    private List<T> data = new ArrayList();

    public PageResult() {
    }

    public PageResult(PageModel<T> pageModel) {
        this.page.number = pageModel.getNumber();
        this.page.size = pageModel.getSize();
        this.page.pages = pageModel.getPages();
        this.page.total = pageModel.getTotal();
        this.data = pageModel.getData();
    }

    public static <T> PageResult<T> success(PageModel<T> pageModel) {
        return new PageResult(pageModel);
    }

    public PageResult.Page getPage() {
        return this.page;
    }

    public List<T> getData() {
        return this.data;
    }

    public void setPage(final PageResult.Page page) {
        this.page = page;
    }

    public void setData(final List<T> data) {
        this.data = data;
    }

    public static class Page implements Serializable {
        private long number;
        private long size;
        private long total;
        private long pages;

        public Page() {
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
    }
}
