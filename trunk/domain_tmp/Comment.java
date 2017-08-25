package com.itshaw.blog.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 评论
 */
@Entity
@Data
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id@GeneratedValue
    private Long id;

    // Contents表主键,关联字段
    private Long cid;

    // 评论生成时的时间戳
    private Date created;

    // 评论作者
    private String author;

    // 评论所属用户id
    private Long author_id;

    // 评论所属内容作者id
    private Long owner_id;

    // 评论者邮件
    private String mail;

    // 评论者网址
    private String url;

    // 评论者ip地址
    private String ip;

    // 评论者客户端
    private String agent;

    // 评论内容
    private String content;

    // 评论类型
    private Integer type;

    // 评论状态
    private Integer status;

    // 父级评论
    private Long parent;

    public Comment() {
    }

}