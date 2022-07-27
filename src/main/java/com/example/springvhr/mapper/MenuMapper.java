package com.example.springvhr.mapper;

import com.example.springvhr.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description: TODO
 * CreateTime: 2022/7/27 13:41
 *
 * @author: dxz
 */
@Mapper
public interface MenuMapper {

    List<Menu> getAllMenusWithRole();

    List<Menu> getAllMenus();
}
