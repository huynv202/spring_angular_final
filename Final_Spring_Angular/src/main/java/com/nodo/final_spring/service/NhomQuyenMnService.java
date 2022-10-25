package com.nodo.final_spring.service;

import com.nodo.final_spring.entity.NhomQuyenMenu;

import java.util.List;

public interface NhomQuyenMnService {
    public List<NhomQuyenMenu> getAll();
    public NhomQuyenMenu save(NhomQuyenMenu nhomQuyenMenu);
    public void delete(NhomQuyenMenu nhomQuyenMenu);
    public NhomQuyenMenu update(NhomQuyenMenu nhomQuyenMenu);

    public List<NhomQuyenMenu> findByNhomQuyenId(int id);

}
