package com.yang.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户表jpa
 * @author yang
 * 2022/04/13
 */
@Data
@Entity
@Table(name = "JPA_USERS")
@NoArgsConstructor
@AllArgsConstructor
public class UsersPO {
    @Id
    private String id;

    private String userName;
    private String sex;
    private String age;

}
