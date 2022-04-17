package com.yang.repository;

import com.yang.po.UsersAddPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

/**
 * 合并表jpa
 * @author yang
 * 2022/04/13
 */
public interface JpaUsersAddPORepository extends JpaRepository<UsersAddPO, String> {

    /**
     * 数据库语言查询 错误方法
     * @return List<UsersAddPO>
     */
    @Query(value = "select u.user_name, u.sex, a.address " +
            " from JPA_USERS u " +
            " left join JPA_ADDRESS a on u.user_name=a.user_name",nativeQuery = true)
    List<UsersAddPO> nativeQueryData();

    /**
     * 数据库语言查map
     * @return List<Map<String, Object>>
     */
    @Query(value = "select u.user_name as userName, u.sex as sex, a.address as address " +
            " from JPA_USERS u " +
            " left join JPA_ADDRESS a on u.user_name=a.user_name",nativeQuery = true)
    List<Map<String, Object>> mapQueryData();

    /**
     * 连表查询数据
     * @return 查询结果
     */
    @Query(value = "select new com.yang.po.UsersAddPO(u.userName, u.sex, a.address) " +
            " from UsersPO u " +
            " left join AddressPO a on u.userName=a.userName")
    List<UsersAddPO> queryData();
}
