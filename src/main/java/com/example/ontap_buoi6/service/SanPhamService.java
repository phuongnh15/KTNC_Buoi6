package com.example.ontap_buoi6.service;

import com.example.ontap_buoi6.entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private List<SanPham> sanPhamList = new ArrayList<>();

    public void addSanPham(SanPham sanPham){
        if(sanPham==null){
            throw new IllegalArgumentException("San pham khong duoc null");
        }
        sanPhamList.add(sanPham);
    }

    public SanPham getOneSanPham(String ma){
        return sanPhamList.stream()
                .filter(sanPham -> sanPham.getMa().equals(ma))
                .findFirst().orElse(null);
    }

    public void updateSanPham(SanPham sanPham){
        for (int i = 0; i<sanPhamList.size();i++){
            if(sanPhamList.get(i).getMa().equals(sanPham.getMa())){
                sanPhamList.set(i,sanPham);
            }else {
                throw new IllegalArgumentException("Khong update duoc");
            }
        }
    }

    public List<SanPham> getAll(){return new ArrayList<>(sanPhamList);}
}
