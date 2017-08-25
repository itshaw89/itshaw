package com.itshaw.blog.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * 内容管理
 */
@Entity
@Data
public class Content implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id@GeneratedValue
    private Long id;

    // 内容标题
    private String title;

    // 内容缩略名
    private String slug;

    // 内容生成时的时间戳
    private Date created;

    // 内容更改时的时间戳
    private Date modified;

    // 内容文字
    private String content;

    // 内容所属用户id
    private Long author_id;

    // 点击次数
    private Integer hits;

    // 内容类别
    private Integer type;

    // 内容类型，markdown或者html
    private Integer fmt_type;

    // 文章缩略图
    private String thumb_img;

    // 标签列表
    private String tags;

    // 分类列表
    private String categories;

    // 内容状态
    private Integer status;

    // 内容所属评论数
    private Integer comments_num;

    // 是否允许评论
    private Boolean allow_comment;

    // 是否允许ping
    private Boolean allow_ping;

    // 允许出现在聚合中
    private Boolean allow_feed;

    public Content() {
    }
}