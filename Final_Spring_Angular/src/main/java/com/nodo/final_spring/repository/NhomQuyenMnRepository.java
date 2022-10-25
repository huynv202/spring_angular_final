package com.nodo.final_spring.repository;

import com.nodo.final_spring.entity.NhomQuyenMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface NhomQuyenMnRepository extends JpaRepository<NhomQuyenMenu, Integer> {

    @Query(value = "select * from nhom_quyen_menu where nhom_quyen_id = ?1", nativeQuery = true)
    List<NhomQuyenMenu> findByNhomQuyenId(@PathVariable int id);
}
