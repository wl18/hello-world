package com.wl.springboottest.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @ Author: wl
 * @ Date: 2021/4/18 22:29
 */
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    private Long id;
    private String name;
    private String email;
}
