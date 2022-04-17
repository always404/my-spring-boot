package com.yang.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 合并表jpa
 * @author yang
 * 2022/04/13
 */
@Data
@Entity
@Table(name = "JPA_USERS_ADD")
@NoArgsConstructor
@AllArgsConstructor
public class UsersAddPO {
    @Id
    private String userName;

    private String sex;
    private String address;
}
