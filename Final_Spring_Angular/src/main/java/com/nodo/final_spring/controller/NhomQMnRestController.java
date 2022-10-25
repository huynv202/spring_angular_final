package com.nodo.final_spring.controller;

import com.nodo.final_spring.entity.NhomQuyenMenu;
import com.nodo.final_spring.service.NhomQuyenMnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nhomquyenmn")
@CrossOrigin(origins = "http://localhost:4200")
public class NhomQMnRestController {
    @Autowired
    private NhomQuyenMnService nhomQuyenMnService;

    @GetMapping("/all")
    public ResponseEntity<List<NhomQuyenMenu>> getAll(){
        return ResponseEntity.ok(nhomQuyenMnService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<NhomQuyenMenu>> getAllByNhomQuyenId(@PathVariable("id") int id) {
        return ResponseEntity.ok(nhomQuyenMnService.findByNhomQuyenId(id));
    }
    @PutMapping("/update")
    public ResponseEntity<NhomQuyenMenu> update(@RequestBody NhomQuyenMenu nhomQuyenMenu){
       NhomQuyenMenu nhomQuyenMenu1 = nhomQuyenMnService.update(nhomQuyenMenu);
        return new ResponseEntity<>(nhomQuyenMenu1, HttpStatus.OK);
    }
}
