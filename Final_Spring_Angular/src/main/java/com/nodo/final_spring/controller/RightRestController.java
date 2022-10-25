package com.nodo.final_spring.controller;

import com.nodo.final_spring.entity.Right;
import com.nodo.final_spring.service.RightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role")
@CrossOrigin(origins = "http://localhost:4200")
public class RightRestController {
    private RightService rightService;
    @Autowired
    public RightRestController(RightService rightService) {
        this.rightService = rightService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Right>> findAll() {
       List<Right> rights = rightService.getAll();
       if (rights.isEmpty()) {
           System.out.println(rights);
           return ResponseEntity.noContent().build();
       }
         return ResponseEntity.ok(rights);
    }
}
