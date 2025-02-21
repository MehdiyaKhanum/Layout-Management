package com.layoutmanagement.Layout_Management.controller;

import com.layoutmanagement.Layout_Management.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/groups")
public class UserGroupController {
    @Autowired
    private UserGroupService userGroupService;

    @PostMapping("/{groupId}/assign-layout")
    public void assignLayoutToGroup(@PathVariable Long groupId, @RequestParam Long layoutId) {
        userGroupService.assignLayoutToGroup(groupId, layoutId);
    }
}
