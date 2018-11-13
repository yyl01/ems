package com.vo;


public class pageBean {
    //当前页
    private int pageindex;
    //当前页显示的条数
    private int currentcount;
    //总条数
    private int totalcount;
    //总页数
    private int totalpage;
    //从第几页开始
    private int begin;
    //第几页结束
    private int end;

    public int getPageindex() {
        return pageindex;
    }

    public void setPageindex(int pageindex) {
        this.pageindex = pageindex;
        this.begin = (pageindex - 1) * 3;
        this.currentcount = 3;
    }

    public int getCurrentcount() {
        return currentcount;
    }

    public void setCurrentcount(int currentcount) {
        this.currentcount = currentcount;

    }

    public int getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(int totalcount) {
        this.totalcount = totalcount;

    }

    public int getTotalpage() {
        return totalpage;
    }

    public void setTotalpage(int totalpage) {
        this.totalpage = totalpage;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public pageBean() {
        super();
        // TODO Auto-generated constructor stub
    }

    public pageBean(int pageindex, int currentcount, int totalcount,
                    int totalpage, int begin, int end) {
        super();
        this.pageindex = pageindex;
        this.currentcount = currentcount;
        this.totalcount = totalcount;
        this.totalpage = totalpage;
        this.begin = begin;
        this.end = end;
    }

    @Override
    public String toString() {
        return "pageBean [pageindex=" + pageindex + ", currentcount="
                + currentcount + ", totalcount=" + totalcount + ", totalpage="
                + totalpage + ", begin=" + begin + ", end=" + end + "]";
    }


}
