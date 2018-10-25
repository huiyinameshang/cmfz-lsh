package com.baizhi.service.impl;

import com.baizhi.dao.BannerDao;
import com.baizhi.entity.Banner;
import com.baizhi.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2018/10/24.
 */
@Service
@Transactional
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerDao bannerDao;

    @Override
    public List<Banner> selectAll(int start,int pagesize) {
        return bannerDao.selectAll(start,pagesize);
    }

    @Override
    public int count() {
        return bannerDao.count();
    }

    @Override
    public void update(int status,int id) {
        bannerDao.update(status,id);
    }

    @Override
    public void delete(int id) {
        bannerDao.delete(id);
    }

    @Override
    public void insert(Banner banner) {
        bannerDao.insert(banner);
    }
}
