package com.itshaw.blog.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 上传附件
 */
@Entity
@Data
public class Attach implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id@GeneratedValue
    private Long id;

    //文件名
    private String fname;

    //文件类型
    private Integer ftype;

    //文件唯一key
    private String fkey;

    //操作者
    private Long author_id;

    //操作时间
    private Date created;

    public Attach(){
    }

}
