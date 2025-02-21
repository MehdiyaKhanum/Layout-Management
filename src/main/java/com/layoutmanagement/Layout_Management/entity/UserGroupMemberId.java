package com.layoutmanagement.Layout_Management.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

public class UserGroupMemberId implements Serializable {
    private Long user;
    private Long group;

    // Getters and Setters
    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public Long getGroup() {
        return group;
    }

    public void setGroup(Long group) {
        this.group = group;
    }

    // Override equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserGroupMemberId that = (UserGroupMemberId) o;
        return Objects.equals(user, that.user) && Objects.equals(group, that.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, group);
    }
}
