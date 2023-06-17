package com.klinnovations.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klinnovations.entity.Plan;

public interface PlanRepo extends JpaRepository<Plan, Integer> {

}