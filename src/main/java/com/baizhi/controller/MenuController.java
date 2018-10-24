package com.baizhi.controller;

import com.baizhi.entity.Menu;
import com.baizhi.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2018/10/23.
 */
@Controller
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    @RequestMapping("/selectAll")
    public @ResponseBody List<Menu> selectAll(){
        return menuService.selectAll();
    }
/*
    @RequestMapping("/selectAll")
    public String selectAll(Map map){
        List<Menu> list=menuService.selectAll();
        map.put("list",list);
        return "main/main";

    }*/
}
