package com.tyler.mapper;

import com.tyler.pojo.Husband;

/**
 * Created by tyler on 2016/12/12.
 */
public interface HusbandMapper {
    public Husband getHusband(int hid);
    public int addHusband(Husband husband);
    public int deleteHusband(int id);
}
