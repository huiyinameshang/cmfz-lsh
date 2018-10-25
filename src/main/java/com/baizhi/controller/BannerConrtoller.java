package com.baizhi.controller;

import com.baizhi.entity.Banner;
import com.baizhi.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.eclipse.jdt.internal.compiler.parser.Parser.name;

/**
 * Created by admin on 2018/10/24.
 */
@Controller
@RequestMapping("/banner")
public class BannerConrtoller {
    @Autowired
    private BannerService bannerService;

    @RequestMapping("/selectAll")
    public @ResponseBody
    Map selectAll(int rows, int page) {
        /*System.out.println(page);
        System.out.println(rows);*/
        Map map = new HashMap();
        int start = (page - 1) * rows;
        /*int end = page*rows;*/
        List<Banner> list = bannerService.selectAll(start, rows);
        int count = bannerService.count();
        map.put("rows", list);
        map.put("total", count);
        return map;
    }

    //    修改
    @RequestMapping("/update")
    public @ResponseBody
    boolean update(int status, int id) {
        try {
            System.out.println(id + "修改id==============================");
            //int id = banner.getId();
            bannerService.update(status, id);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return false;
    }

    //删除
    @RequestMapping("/delete")
    public @ResponseBody
    boolean delete(int id) {
        try {
            System.out.println(id + "     删除id==============================");
            bannerService.delete(id);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return false;
    }
//    添加
    @RequestMapping("/insert")

    public @ResponseBody boolean insert(Banner banner){
        System.out.println(banner+"接收的对象");
        try {
            bannerService.insert(banner);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return false;
    }

}
