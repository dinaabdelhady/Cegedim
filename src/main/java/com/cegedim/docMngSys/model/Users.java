package com.cegedim.docMngSys.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String userName;
    private String password;
    @ManyToMany
    @JoinTable(
            name = "role_users",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Roles> userRoles;

    public void setUserId(Long userId) {
        this.id = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserRoles(List userRoles) {
        this.userRoles = userRoles;
    }

    public Long getUserId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public List getUserRoles() {
        return userRoles;
    }




}
