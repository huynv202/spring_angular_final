package com.nodo.final_spring.repository;

import com.nodo.final_spring.entity.NhomQuyen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NhomQuyenRepository extends JpaRepository<NhomQuyen, Integer> {

}
