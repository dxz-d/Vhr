package com.example.springvhr.service;

import com.example.springvhr.entity.Menu;
import com.example.springvhr.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Description: TODO
 * CreateTime: 2022/7/27 13:28
 *
 * @author: dxz
 */
@Service
@CacheConfig(cacheNames = "menus_cache")
public class MenuService {

    @Autowired
    MenuMapper menuMapper;

    public List<Menu> getAllMenusWithRole() {
        return menuMapper.getAllMenusWithRole();
    }

    public List<Menu> getAllMenu() {
        return menuMapper.getAllMenus();
    }
}
