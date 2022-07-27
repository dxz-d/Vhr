package com.example.springvhr.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Description: TODO
 * CreateTime: 2022/7/27 13:31
 *
 * @author: dxz
 */
@Data
public class Menu implements Serializable {
    private Integer id;

    private String url;

    private String path;

    private String component;

    private String name;

    private String iconCls;

    private Meta meta;

    private Integer parentId;

    private Boolean enabled;
    private List<Menu> children;
    private List<Role> roles;
}
