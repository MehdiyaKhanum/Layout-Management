package com.layoutmanagement.Layout_Management.service;

import com.layoutmanagement.Layout_Management.entity.Layout;
import com.layoutmanagement.Layout_Management.repository.LayoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LayoutService {
    @Autowired
    private LayoutRepository layoutRepository;

    public List<Layout> getAllLayouts() {
        return layoutRepository.findAll();
    }
}
