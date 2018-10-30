package com.example.demo.jpa;

import com.example.demo.constraint.DepartmentType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@EntityListeners(AuditingEntityListener.class)
public class SsdTest implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    private String name;

    private int age;

    private DepartmentType departmentType;

    @Column(unique = true,columnDefinition = "VARCHAR(10)")
    private String uid;

    @CreatedDate
    private Long createAt;

    /*@Column(columnDefinition = "TEXT")
    private List<personalInformation> body;*/

    public SsdTest() {
    }

    public SsdTest(String name, int age, DepartmentType departmentType, String uid, Long createAt, List<personalInformation> body) {
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
