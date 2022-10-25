package com.nodo.final_spring.controller;

import com.nodo.final_spring.entity.NhomQuyen;
import com.nodo.final_spring.service.NhomQuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nhomquyen")
@CrossOrigin(origins = "http://localhost:4200")
public class NhomQuyenRestController {
    @Autowired
    private NhomQuyenService nhomQuyenService;

    @GetMapping("/all")
    public ResponseEntity<List<NhomQuyen>> getAll(){
        return ResponseEntity.ok(nhomQuyenService.getAll());
    }
}
