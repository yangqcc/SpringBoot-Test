package com.yqc.manage.domain.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by yangqc on 2017/10/25
 */
@Entity
@Table(name = "hyc_Tabledzxzcf")
@Data
public class Tabledzxzcf implements Serializable {

    @Id
    private String id;
    //主键	Uuid
    private String DOCID;
    //所在区域	镇海区
    private String hyc_0001_dq;
    //处罚金额（万元）
    private String hyc_0006_cfje;
    //处罚种类	罚款
    private String hyc_0013_cfzl;
    //处罚环节ID
    private String hy_curtacheid;
    //登记时间
    private Date hy_djsj;
    //案由	违反建设项目环境影响评价制度
    private String hyc_0002_ay;
}
