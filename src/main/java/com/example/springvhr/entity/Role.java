package com.example.springvhr.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Description: TODO
 * CreateTime: 2022/7/27 11:30
 *
 * @author: dxz
 */
@Data
public class Role implements Serializable {
    private Integer id;

    private String name;

    private String nameZh;
}
