package com.example.jan2023.controller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Student {

    @Id
    private int rollno;
    private String name;
    private String city;
    private String createdby;
    private String modifiedby;
    private Date createddate;
    private Timestamp modifieddate;
    private int courseid;

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", createdby='" + createdby + '\'' +
                ", modifiedby='" + modifiedby + '\'' +
                ", createddate=" + createddate +
                ", modifieddate=" + modifieddate +
                ", courseid=" + courseid +
                '}';
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {this.rollno = rollno;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getCity() {return city;}

    public void setCity(String city) {this.city = city;}

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Timestamp getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Timestamp modifieddate) {
        this.modifieddate = modifieddate;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }
}
