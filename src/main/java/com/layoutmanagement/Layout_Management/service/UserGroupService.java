package com.layoutmanagement.Layout_Management.service;

import com.layoutmanagement.Layout_Management.entity.Layout;
import com.layoutmanagement.Layout_Management.entity.UserGroup;
import com.layoutmanagement.Layout_Management.repository.LayoutRepository;
import com.layoutmanagement.Layout_Management.repository.UserGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserGroupService {
    @Autowired
    private UserGroupRepository userGroupRepository;

    @Autowired
    private LayoutRepository layoutRepository;

    public void assignLayoutToGroup(Long groupId, Long layoutId) {
        UserGroup group = userGroupRepository.findById(groupId).orElseThrow(() -> new RuntimeException("Group not found"));
        Layout layout = layoutRepository.findById(layoutId).orElseThrow(() -> new RuntimeException("Layout not found"));
        group.setLayout(layout);
        userGroupRepository.save(group);
    }
}
