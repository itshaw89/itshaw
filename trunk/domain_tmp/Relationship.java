package com.itshaw.blog.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 关系
 */
@Entity
@Data
public class Relationship implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id@GeneratedValue
    private Long id;

    // Content id
    private Long cid;

    // Meta id
    private Long mid;

    public Relationship() {
    }

}