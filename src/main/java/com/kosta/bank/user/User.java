package com.kosta.bank.user;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User {

    @Id @GeneratedValue
    private long id;
    @Column(name = "db_name", nullable = false, unique = true)
    private String name;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;
    @Enumerated(EnumType.STRING)
    private Role role;
    @Transient
    private String temp;

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
