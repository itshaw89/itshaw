package com.itshaw.blog.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 *  属性数据
 */
@Entity
@Data
public class Meta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id@GeneratedValue
    private Long id;

    // 名称
    private String name;

    // 项目缩略名
    private String slug;

    // 项目类型
    private Integer type;

    // 选项描述
    private String description;

    // 项目排序
    private Integer sort;

    public Meta() {
    }
}