package com.nodo.final_spring.repository;

import com.nodo.final_spring.entity.Right;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RightRepository extends JpaRepository<Right, Integer> {

}
