package com.layoutmanagement.Layout_Management.repository;

import com.layoutmanagement.Layout_Management.entity.Layout;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LayoutRepository extends JpaRepository<Layout, Long> {
}