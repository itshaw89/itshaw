package com.itshaw.blog.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 配置
 */
@Entity
@Data
public class Option implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id@GeneratedValue
    private Long id;

    // 配置名称
    private String name;

    // 配置值
    private String value;

    // 配置描述
    private String description;

    public Option() {
    }

}