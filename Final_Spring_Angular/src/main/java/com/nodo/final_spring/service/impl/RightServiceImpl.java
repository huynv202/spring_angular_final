package com.nodo.final_spring.service.impl;

import com.nodo.final_spring.entity.Right;
import com.nodo.final_spring.repository.RightRepository;
import com.nodo.final_spring.service.RightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RightServiceImpl implements RightService {
    @Autowired
    private RightRepository rightRepository;
    @Override
    public List<Right> getAll() {
        return rightRepository.findAll();
    }

    @Override
    public Right findById(int id) {
        return rightRepository.findById(id).get();
    }

    @Override
    public Right save(Right right) {
        return rightRepository.save(right);
    }

    @Override
    public void deleteById(int id) {
        rightRepository.deleteById(id);
    }

    @Override
    public Right update(Right right) {
        return rightRepository.save(right);
    }
}

