package com.layoutmanagement.Layout_Management.service;

import com.layoutmanagement.Layout_Management.entity.Layout;
import com.layoutmanagement.Layout_Management.repository.LayoutRepository;
import com.layoutmanagement.Layout_Management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.layoutmanagement.Layout_Management.entity.User;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private LayoutRepository layoutRepository;

    public void assignLayoutToUser(Long userId, Long layoutId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        Layout layout = layoutRepository.findById(layoutId).orElseThrow(() -> new RuntimeException("Layout not found"));
        user.setLayout(layout);
        userRepository.save(user);
    }

    public Layout getLayoutForUser(String username) {
        User user = userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("User not found"));
        return user.getLayout();
    }
}