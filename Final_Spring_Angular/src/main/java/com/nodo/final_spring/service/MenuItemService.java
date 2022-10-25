package com.nodo.final_spring.service;

import com.nodo.final_spring.entity.MenuItem;

import java.util.List;

public interface MenuItemService {
    public List<MenuItem> getAll();
    public MenuItem save(MenuItem menuItem);
    public void delete(MenuItem menuItem);
    public MenuItem update(MenuItem menuItem);

}
