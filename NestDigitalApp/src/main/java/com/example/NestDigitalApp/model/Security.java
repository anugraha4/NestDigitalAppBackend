package com.example.NestDigitalApp.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "security")
public class Security {

    @Id
    @GeneratedValue
    private int id;
    private int secempcode;
    private String secname;
    private String secsalary;
    private String secphnNo;
    private String secmail;
    private String secusername;
    private String secpassword;

    public Security() {
    }

    public Security(int id, int secempcode, String secname, String secsalary, String secphnNo, String secmail, String secusername, String secpassword) {
        this.id = id;
        this.secempcode = secempcode;
        this.secname = secname;
        this.secsalary = secsalary;
        this.secphnNo = secphnNo;
        this.secmail = secmail;
        this.secusername = secusername;
        this.secpassword = secpassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSecempcode() {
        return secempcode;
    }

    public void setSecempcode(int secempcode) {
        this.secempcode = secempcode;
    }

    public String getSecname() {
        return secname;
    }

    public void setSecname(String secname) {
        this.secname = secname;
    }

    public String getSecsalary() {
        return secsalary;
    }

    public void setSecsalary(String secsalary) {
        this.secsalary = secsalary;
    }

    public String getSecphnNo() {
        return secphnNo;
    }

    public void setSecphnNo(String secphnNo) {
        this.secphnNo = secphnNo;
    }

    public String getSecmail() {
        return secmail;
    }

    public void setSecmail(String secmail) {
        this.secmail = secmail;
    }

    public String getSecusername() {
        return secusername;
    }

    public void setSecusername(String secusername) {
        this.secusername = secusername;
    }

    public String getSecpassword() {
        return secpassword;
    }

    public void setSecpassword(String secpassword) {
        this.secpassword = secpassword;
    }
}
