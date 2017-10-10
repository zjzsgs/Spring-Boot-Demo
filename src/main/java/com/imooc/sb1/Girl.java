package com.imooc.sb1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//jpa注解
@Entity//对应数据库中的一张表
public class Girl {
    @Id//主键
    @GeneratedValue//自增
    private Integer id;
    @Column(length = 1)//设置字段长度
    private String cupSize;
    private Integer age;

    public Girl() {//必须
    }

    public Girl(String cupSize, Integer age) {//为了new用
        this.cupSize = cupSize;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
