package com.nodo.final_spring.service.impl;

import com.nodo.final_spring.entity.NhomQuyenMenu;
import com.nodo.final_spring.repository.NhomQuyenMnRepository;
import com.nodo.final_spring.service.NhomQuyenMnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NhomQuyenMenuServiceImpl implements NhomQuyenMnService {

    @Autowired
    private NhomQuyenMnRepository nhomQuyenMnRepository;

    @Override
    public List<NhomQuyenMenu> getAll() {
        return nhomQuyenMnRepository.findAll();
    }

    @Override
    public NhomQuyenMenu save(NhomQuyenMenu nhomQuyenMenu) {
        return nhomQuyenMnRepository.save(nhomQuyenMenu);
    }

    @Override
    public void delete(NhomQuyenMenu nhomQuyenMenu) {
        nhomQuyenMnRepository.delete(nhomQuyenMenu);
    }

    @Override
    public NhomQuyenMenu update(NhomQuyenMenu nhomQuyenMenu) {
        return nhomQuyenMnRepository.save(nhomQuyenMenu);
    }

    @Override
    public List<NhomQuyenMenu> findByNhomQuyenId(int id) {
        return nhomQuyenMnRepository.findByNhomQuyenId(id);
    }


}
