package com.nodo.final_spring.service.impl;

import com.nodo.final_spring.entity.MenuItem;
import com.nodo.final_spring.repository.MenuItemRepository;
import com.nodo.final_spring.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MenuItemServiceImpl implements MenuItemService {

    @Autowired
    private MenuItemRepository menuItemRepository;

    @Override
    public List<MenuItem> getAll() {
        return menuItemRepository.findAll();
    }

    @Override
    public MenuItem save(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }

    @Override
    public void delete(MenuItem menuItem) {
        menuItemRepository.delete(menuItem);
    }

    @Override
    public MenuItem update(MenuItem menuItem) {
        return menuItemRepository.save(menuItem);
    }
}
