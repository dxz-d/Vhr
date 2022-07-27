package com.example.springvhr.mapper;

import com.example.springvhr.entity.Hr;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description: TODO
 * CreateTime: 2022/7/27 13:05
 *
 * @author: dxz
 */
@Mapper
public interface HrMapper {

    Hr loadUserByUsername(String s);
}
