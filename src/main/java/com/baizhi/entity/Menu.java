package com.baizhi.entity;

import java.util.List;

/**
 * Created by admin on 2018/10/23.
 */
public class Menu {
    private int id;
    private String title;
    private String iconCls;
    private String url;

    public Menu(int id, String title, String iconCls, String url, List<Menu> menuList) {
        this.id = id;
        this.title = title;
        this.iconCls = iconCls;
        this.url = url;
        this.menuList = menuList;
    }

    private List<Menu> menuList;

    public Menu() {
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", iconCls='" + iconCls + '\'' +
                ", url='" + url + '\'' +
                ", menuList=" + menuList +
                '}';
    }
}
