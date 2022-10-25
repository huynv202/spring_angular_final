package com.nodo.final_spring.service.impl;

import com.nodo.final_spring.entity.NhomQuyen;
import com.nodo.final_spring.repository.NhomQuyenRepository;
import com.nodo.final_spring.service.NhomQuyenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class NhomQuyenServiceImp implements NhomQuyenService {

    @Autowired
    private NhomQuyenRepository nhomQuyenRepository;

    @Override
    public List<NhomQuyen> getAll() {
        return nhomQuyenRepository.findAll();
    }

    @Override
    public NhomQuyen findById(int id) {
        return nhomQuyenRepository.findById(id).get();
    }

    @Override
    public NhomQuyen save(NhomQuyen nhomQuyen) {
        return nhomQuyenRepository.save(nhomQuyen);
    }

    @Override
    public void deleteById(int id) {
        nhomQuyenRepository.deleteById(id);
    }

    @Override
    public NhomQuyen update(NhomQuyen nhomQuyen) {
        return nhomQuyenRepository.save(nhomQuyen);
    }


}
