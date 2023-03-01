package com.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.*;

@Entity
@Table(name="attendence")
public class Attendence {
    @Id
    @Column(name="attendencedate")
    private String attendencedate;

    @Column(name="presence")
    private String presence;

    @Column(name="attendenceid")
    private String attendenceid;

    //private List<Student> studentlist;
    //private List<Teacher> teacherlist;

    public String getAttendencedate() {
        return attendencedate;
    }

    public void setAttendencedate(String attendencedate) {
        this.attendencedate = attendencedate;
    }

    public String getPresence() {
        return presence;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }
}
