package com.yang.repository.impl;

import com.yang.po.UsersAddPO;
import com.yang.repository.JpaUsersAddPORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 合并表操作实现
 * @author yang
 * 2022/04/13
 */
@Component
public class UsersAddPORepositoryImpl {

    @Autowired
    private JpaUsersAddPORepository jpaUsersAddPORepository;

    /**
     * 保存
     * @param po 实体类
     */
    public void saveAndFlush(UsersAddPO po) {
        jpaUsersAddPORepository.saveAndFlush(po);
    }

    /**
     * 数据库语言查询 错误方法
     * @return 结果
     */
    public List<UsersAddPO> nativeFindAndSave() {
        return jpaUsersAddPORepository.nativeQueryData();
    }

    /**
     * 数据库语言查询返回map
     * @return 查询结果
     */
    public List<Map<String, Object>> mapFindAndSave() {
        return jpaUsersAddPORepository.mapQueryData();
    }

    /**
     * 连表查找数据
     * @return 查询结果
     */
    public List<UsersAddPO> findData() {
        return jpaUsersAddPORepository.queryData();
    }

}
