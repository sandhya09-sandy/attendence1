package com.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="teacher1")
public class Teacher {

    @Id
    @Column(name="tid")
    private int tid;
    @Column(name="tname")
    private String tname;
    @Column(name="course")
    private String course;

    //private List<Admin> adminList;

    //private Attendence attendence;
    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

