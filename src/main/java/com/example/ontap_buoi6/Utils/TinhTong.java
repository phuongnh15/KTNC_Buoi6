package com.example.ontap_buoi6.Utils;

public class TinhTong {
    //tinh tong le 1-n
    public int tinhTongLe(int n){
        if(n<1){
            throw new IllegalArgumentException("n phai > 1");
        }
        int tong = 0;
        for (int i = 1;i<=n;i++){
            if(i%2!=0){
                tong+=i;
            }
        }
        return tong;
    }

    //tinh tong chan
    public int tinhTongChan(int n){
        if(n<1){
            throw new IllegalArgumentException("n phai > 1");
        }
        int tong = 0;
        for (int i = 1; i<=n;i++){
            if(i%2==0){
                tong+=i;
            }
        }
        return tong;
    }

    //tinh tong cac phan tu mang
    public int tinhTongMang(int [] arr){
        if(arr==null){
            throw new IllegalArgumentException("Arr khong duoc null");
        }
        int tong = 0;
        for (int i = 0;i<arr.length;i++){
            tong+=arr[i];
        }
        return tong;
    }
}
