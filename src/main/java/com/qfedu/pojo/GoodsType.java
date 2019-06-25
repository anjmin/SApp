package com.qfedu.pojo;

/**
 * Created by Administrator on 2019/6/25 0025.
 */
public class GoodsType {

    private Integer tid;
    private  String tname;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                '}';
    }
}
