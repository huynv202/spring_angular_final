package com.nodo.final_spring.controller;

import com.nodo.final_spring.entity.MenuItem;
import com.nodo.final_spring.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menuitem")
@CrossOrigin(origins = "http://localhost:4200")
public class MenuItemRestController {
    @Autowired
    private MenuItemService menuItemService;
    @GetMapping("/all")
    public ResponseEntity<List<MenuItem>> getAll(){
        return ResponseEntity.ok(menuItemService.getAll());
    }

}
