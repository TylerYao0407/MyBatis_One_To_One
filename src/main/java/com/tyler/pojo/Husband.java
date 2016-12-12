package com.tyler.pojo;

/**
 * Created by tyler on 2016/12/12.
 */
public class Husband {
    private int hid;
    private String hname;

    public Husband(){}
    public Husband(String hname) {
        this.hname = hname;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }
}
