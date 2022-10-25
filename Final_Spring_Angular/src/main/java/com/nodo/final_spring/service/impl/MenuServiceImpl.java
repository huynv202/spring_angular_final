package com.nodo.final_spring.service.impl;

import com.nodo.final_spring.entity.Menu;
import com.nodo.final_spring.repository.MenuRepository;
import com.nodo.final_spring.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {


    private MenuRepository menuRepository;

    @Autowired
    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public List<Menu> findAll() {
        return menuRepository.findAll();
    }

    @Override
    public Menu findById(int id) {
        return menuRepository.findById(id).get();
    }

    @Override
    public void save(Menu menu) {
        menuRepository.save(menu);
    }

    @Override
    public void deleteById(int id) {
        menuRepository.deleteById(id);
    }
}
