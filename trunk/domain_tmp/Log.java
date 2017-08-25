package com.itshaw.blog.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 日志记录对象
  */
@Entity
@Data
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id@GeneratedValue
    private Long id;

    // 产生的动作
    private String action;

    // 产生的数据
    private String data;

    // 发生人id
    private Long author_id;

    // 日志产生的ip
    private String ip;

    // 日志创建时间
    private Date created;

    public Log() {
    }
}