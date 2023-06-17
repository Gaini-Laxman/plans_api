package com.klinnovations.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klinnovations.entity.PlanCateogry;

public interface PlanCategoryRepo extends JpaRepository<PlanCateogry, Integer> {

}