package com.example.ontap_buoi6.Utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongTest {
    private TinhTong tinhTong;

    @BeforeEach
    void setUp(){
        tinhTong = new TinhTong();
    }

    @Test
    void testTinhTongLeWithHopLe() {
        Assertions.assertEquals(9,tinhTong.tinhTongLe(5));
    }

    @Test
    void testTinhTongLeWithInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class,()->tinhTong.tinhTongLe(-2));
    }

    @Test
    void testTinhTongChanHopLe() {
        Assertions.assertEquals(6,tinhTong.tinhTongChan(5));
    }

    @Test
    void testTinhTongChanWithInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class,()->tinhTong.tinhTongChan(-2));
    }

    @Test
    void testTinhTongMangHopLe() {
        int [] arr = {2,5,1,7,9};
        Assertions.assertEquals(24,tinhTong.tinhTongMang(arr));
    }

    @Test
    void testTinhTongMangWithInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class,()->tinhTong.tinhTongMang(null));
    }
}