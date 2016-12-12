package com.tyler.mapper;

import com.tyler.pojo.Wife;

/**
 * Created by tyler on 2016/12/12.
 */
public interface WifeMapper {
    public Wife getWife(int wid);
    public int addWife(Wife wife);
    public int deleteWife(int id);
}
