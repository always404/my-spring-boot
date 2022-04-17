package com.yang.repository;

import com.yang.po.AddressPO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 地址表jpa
 * @author yang
 * 2022/04/13
 */
public interface JpaAddressPORepository extends JpaRepository<AddressPO, String> {
}
