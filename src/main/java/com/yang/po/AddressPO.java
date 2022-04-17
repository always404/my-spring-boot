package com.yang.po;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

/**
 * 地址表jpa
 * @author yang
 * 2022/04/13
 */
@Data
@Entity
@Table(name = "JPA_ADDRESS")
@NoArgsConstructor
@AllArgsConstructor
public class AddressPO {
    @Id
    private String id;

    private String userName;
    private String address;

}
