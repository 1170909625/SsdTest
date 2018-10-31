package com.example.demo.vo;

import com.example.demo.constraint.DepartmentType;

/**
 * create by ssd on 18/10/18
 */
public class SsdTestVO {

    private Long id;

    private String name;

    private int age;

    private DepartmentType departmentType;

    private String uid;

    private Long createAt;

    public SsdTestVO() {
    }

    public SsdTestVO(Long id, String name, int age, DepartmentType departmentType, String uid, Long createAt) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.departmentType = departmentType;
        this.uid = uid;
        this.createAt = createAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DepartmentType getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(DepartmentType departmentType) {
        this.departmentType = departmentType;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }
}
