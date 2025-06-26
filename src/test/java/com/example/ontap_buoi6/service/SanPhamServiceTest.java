package com.example.ontap_buoi6.service;

import com.example.ontap_buoi6.entity.SanPham;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {
    private SanPhamService sanPhamService;

    @BeforeEach
    void setUp(){
        sanPhamService = new SanPhamService();
    }

    @Test
    void testAddSanPhamHopLe() {
        SanPham sanPham = new SanPham("SP1","Quat dien",2,20000f,2,"Do gia dung");
        sanPhamService.addSanPham(sanPham);

        Assertions.assertEquals(1,sanPhamService.getAll().size());
    }

    @Test
    void testAddSanPhamWithInvalidMa() {
        Assertions.assertThrows(IllegalArgumentException.class,()->sanPhamService.addSanPham(new SanPham("","Quat dien",2,20000f,2,"Do gia dung")));
    }

    @Test
    void testAddSanPhamWithInvalidTen() {
        Assertions.assertThrows(IllegalArgumentException.class,()->sanPhamService.addSanPham(new SanPham("SP1","",2,20000f,2,"Do gia dung")));
    }

    @Test
    void testAddSanPhamWithInvalidNamBaoHanh() {
        Assertions.assertThrows(IllegalArgumentException.class,()->sanPhamService.addSanPham(new SanPham("SP1","Quat dien",-2,20000f,2,"Do gia dung")));
    }

    @Test
    void testAddSanPhamWithInvalidGia() {
        Assertions.assertThrows(IllegalArgumentException.class,()->sanPhamService.addSanPham(new SanPham("SP1","Quat dien",2,-20000f,2,"Do gia dung")));
    }

    @Test
    void testAddSanPhamWithInvalidSoLuong() {
        Assertions.assertThrows(IllegalArgumentException.class,()->sanPhamService.addSanPham(new SanPham("SP1","Quat dien",2,20000f,-2,"Do gia dung")));
    }

    @Test
    void testAddSanPhamWithInvalidDanhMuc() {
        Assertions.assertThrows(IllegalArgumentException.class,()->sanPhamService.addSanPham(new SanPham("SP1","Quat dien",2,20000f,2,"")));
    }

    @Test
    void testUpdateSanPhamHopLe() {
        SanPham sanPham = new SanPham("SP1","Quat dien",2,20000f,2,"Do gia dung");
        sanPhamService.addSanPham(sanPham);

        sanPham.setTen("Quat cay");
        sanPham.setNamBaoHanh(3);
        sanPham.setSoLuong(5);
        sanPhamService.updateSanPham(sanPham);

        Assertions.assertEquals("Quat cay",sanPhamService.getOneSanPham("SP1").getTen());
        Assertions.assertEquals(3,sanPhamService.getOneSanPham("SP1").getNamBaoHanh());
        Assertions.assertEquals(5,sanPhamService.getOneSanPham("SP1").getSoLuong());
    }

    @Test
    void testUpdateSanPhamWithInvalidTen() {
        SanPham sanPham = new SanPham("SP1","Quat dien",2,20000f,2,"Do gia dung");
        sanPhamService.addSanPham(sanPham);

        Assertions.assertThrows(IllegalArgumentException.class,()->sanPhamService.updateSanPham(new SanPham("SP1","",2,20000f,2,"Do gia dung")));
    }

    @Test
    void testUpdateSanPhamWithInvalidNamBaoHanh() {
        SanPham sanPham = new SanPham("SP1","Quat dien",2,20000f,2,"Do gia dung");
        sanPhamService.addSanPham(sanPham);

        Assertions.assertThrows(IllegalArgumentException.class,()->sanPhamService.updateSanPham(new SanPham("SP1","Quat",-2,20000f,2,"Do gia dung")));
    }

    @Test
    void testUpdateSanPhamWithInvalidGia() {
        SanPham sanPham = new SanPham("SP1","Quat dien",2,20000f,2,"Do gia dung");
        sanPhamService.addSanPham(sanPham);

        Assertions.assertThrows(IllegalArgumentException.class,()->sanPhamService.updateSanPham(new SanPham("SP1","Quat",2,-20000f,2,"Do gia dung")));
    }

    @Test
    void testUpdateSanPhamWithInvalidSoLuong() {
        SanPham sanPham = new SanPham("SP1","Quat dien",2,20000f,2,"Do gia dung");
        sanPhamService.addSanPham(sanPham);

        Assertions.assertThrows(IllegalArgumentException.class,()->sanPhamService.updateSanPham(new SanPham("SP1","Quat",2,20000f,-2,"Do gia dung")));
    }

    @Test
    void testUpdateSanPhamWithInvalidDanhMuc() {
        SanPham sanPham = new SanPham("SP1","Quat dien",2,20000f,2,"Do gia dung");
        sanPhamService.addSanPham(sanPham);

        Assertions.assertThrows(IllegalArgumentException.class,()->sanPhamService.updateSanPham(new SanPham("SP1","Quat",2,20000f,2,"")));
    }
}