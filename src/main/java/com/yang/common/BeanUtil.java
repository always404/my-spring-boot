package com.yang.common;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Bean工具类
 * @author yang
 * 2022/04/13
 */
public class BeanUtil {
    public static <T,K> List<K> copeListFast(List<T> source, Class<K> targetClass) {
        if(CollectionUtil.isEmptyList(source)) {
            return new ArrayList<>();
        }
        return JSON.parseArray(JSON.toJSONString(source), targetClass);
    }
}
