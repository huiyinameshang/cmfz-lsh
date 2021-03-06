package com.baizhi.dao;

import com.baizhi.entity.Banner;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by admin on 2018/10/24.
 */
public interface BannerDao {
    public List<Banner> selectAll(@Param("start")int start,@Param("pagesize")int pagesize);
    public int count();
    public void delete(int id);
    public void update(@Param("status")int status,@Param("id") int id);
    public void insert(Banner banner);


}
