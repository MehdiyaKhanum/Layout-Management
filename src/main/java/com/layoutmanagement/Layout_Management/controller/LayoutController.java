package com.layoutmanagement.Layout_Management.controller;

import com.layoutmanagement.Layout_Management.entity.Layout;
import com.layoutmanagement.Layout_Management.service.LayoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/layouts")
public class LayoutController {
    @Autowired
    private LayoutService layoutService;

    @GetMapping
    public List<Layout> getAllLayouts() {
        return layoutService.getAllLayouts();
    }
}
