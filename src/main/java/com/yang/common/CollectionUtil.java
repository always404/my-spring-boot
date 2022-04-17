package com.yang.common;

import java.util.List;

/**
 * 集合工具类
 * @author yang
 * 2022/04/13
 */
public class CollectionUtil {
    public static boolean isEmptyList(List list) {
        return list == null || list.isEmpty();
    }
}
