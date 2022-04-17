package com.yang.repository;

import com.yang.po.UsersPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户表jpa
 * @author yang
 * 2022/04/13
 */
public interface JpaUsersPORepository extends JpaRepository<UsersPO, String> {
}
