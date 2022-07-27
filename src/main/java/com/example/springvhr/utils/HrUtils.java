package com.example.springvhr.utils;

import com.example.springvhr.entity.Hr;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Description: TODO
 * CreateTime: 2022/7/27 16:18
 *
 * @author: dxz
 */
public class HrUtils {
    public static Hr getCurrentHr() {
        return ((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
