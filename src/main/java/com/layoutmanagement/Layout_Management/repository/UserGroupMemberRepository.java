package com.layoutmanagement.Layout_Management.repository;

import com.layoutmanagement.Layout_Management.entity.UserGroupMember;
import com.layoutmanagement.Layout_Management.entity.UserGroupMemberId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserGroupMemberRepository extends JpaRepository<UserGroupMember, UserGroupMemberId> {
}