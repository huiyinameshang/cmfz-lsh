package com.baizhi.dao;

import com.baizhi.entity.Admin;
import org.apache.ibatis.annotations.Param;

/**
 * Created by admin on 2018/10/23.
 */
public interface AdminDao {
    public Admin selectOne(Admin admin);
}
