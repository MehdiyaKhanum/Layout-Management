package com.layoutmanagement.Layout_Management.entity;

import jakarta.persistence.*;

@Entity
@IdClass(UserGroupMemberId.class)
public class UserGroupMember {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "group_id")
    private UserGroup group;

    // Getters and Setters
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserGroup getGroup() {
        return group;
    }

    public void setGroup(UserGroup group) {
        this.group = group;
    }
}

