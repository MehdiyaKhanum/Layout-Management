package com.layoutmanagement.Layout_Management.controller;

import com.layoutmanagement.Layout_Management.entity.Layout;
import com.layoutmanagement.Layout_Management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/{userId}/assign-layout")
    public void assignLayoutToUser(@PathVariable Long userId, @RequestParam Long layoutId) {
        userService.assignLayoutToUser(userId, layoutId);
    }

    @GetMapping("/{username}/layout")
    public Layout getLayoutForUser(@PathVariable String username) {
        return userService.getLayoutForUser(username);
    }
}
