package main;

import shapes.HinhChuNhat;
import shapes.HinhTron;

public class MainClass {
    public static void main(String[] args){
        HinhTron hinhtron = new HinhTron();
        HinhChuNhat hinhchunhat = new HinhChuNhat();
        
        
        hinhtron.NhapBanKinh();
        hinhtron.TinhChuVi();
        hinhtron.TinhDienTich();
        hinhtron.InChuVi();
        hinhtron.InDienTich();

        System.out.println("\n\n");

        
        hinhchunhat.NhapChieuDai();
        hinhchunhat.NhapChieuRong();
        hinhchunhat.TinhChuVi();
        hinhchunhat.TinhDienTich();
        hinhchunhat.InChuVi();
        hinhchunhat.InDienTich();

    }
    
}
