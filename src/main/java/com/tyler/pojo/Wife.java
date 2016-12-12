package com.tyler.pojo;

/**
 * Created by tyler on 2016/12/12.
 */
public class Wife {
    private int wid;
    private String wname;
    private Husband husband;

    public Wife(){}
    public Wife(String wname, Husband husband) {
        this.wname = wname;
        this.husband = husband;
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getWname() {
        return wname;
    }

    public void setWname(String wname) {
        this.wname = wname;
    }

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }
}
