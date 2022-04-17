package com.yang.service;

import com.yang.common.BeanUtil;
import com.yang.po.UsersAddPO;
import com.yang.repository.impl.UsersAddPORepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 合并表服务类
 * @author yang
 * 2022/04/13
 */
@Service
public class UsersAddService {
    @Autowired
    private UsersAddPORepositoryImpl usersAddPORepository;

    public List<UsersAddPO> findData() {
        return usersAddPORepository.findData();
    }

    /**
     * 数据库语言查询 错误方法
     * @return 结果
     */
    public void nativeFindAndSave() {
        List<UsersAddPO> poList = usersAddPORepository.nativeFindAndSave();
        System.out.println("====查询的数据===" + poList);
        poList.forEach(e->{
            System.out.println("====准备插入===" + e);
            usersAddPORepository.saveAndFlush(e);
        });
    }

    /**
     * 数据库语言查询返回map
     */
    public void mapFindAndSave() {
        List<Map<String, Object>> poMap = usersAddPORepository.mapFindAndSave();
        List<UsersAddPO> poList = BeanUtil.copeListFast(poMap, UsersAddPO.class);
        System.out.println("====查询的数据===" + poList);
        poList.forEach(e->{
            System.out.println("====准备插入===" + e);
            usersAddPORepository.saveAndFlush(e);
        });
    }

    /**
     * 连表查找数据
     */
    public void findAndSave() {
        List<UsersAddPO> poList = usersAddPORepository.findData();
        System.out.println("====查询的数据===" + poList);
        poList.forEach(e->{
            System.out.println("====准备插入===" + e);
            usersAddPORepository.saveAndFlush(e);
        });
    }
}
