package com.nodo.final_spring.service;

import com.nodo.final_spring.entity.NhomQuyen;

import java.util.List;

public interface NhomQuyenService {

    public List<NhomQuyen> getAll();
    public NhomQuyen findById(int id);
    public NhomQuyen save(NhomQuyen nhomQuyen);
    public void deleteById(int id);
    public NhomQuyen update(NhomQuyen nhomQuyen);
}
