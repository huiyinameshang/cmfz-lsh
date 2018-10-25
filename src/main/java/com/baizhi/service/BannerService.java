package com.baizhi.service;


import com.baizhi.entity.Banner;

import java.util.List;

/**
 * Created by admin on 2018/10/24.
 */

public interface BannerService {
   public List<Banner> selectAll(int start,int pagesize);
   public int count();
   public void update(int status,int id);
   public void delete(int id);
   public void insert(Banner banner);


}
