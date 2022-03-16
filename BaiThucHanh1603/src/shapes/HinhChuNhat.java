package shapes;

import java.util.Scanner;

public class HinhChuNhat {
    float dai; 
    float rong;
    float cv;
    float dt;
    public void NhapChieuDai(){
        System.out.println("Hay nhap vao chieu dai hinh chu nhat: ");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextFloat();
        sc.close();

    }
    public void NhapChieuRong(){
        System.out.println("Hay nhap vao chieu rong hinh chu nhat: ");
        Scanner sc = new Scanner(System.in);
        rong = sc.nextFloat();
        sc.close();
    }
    public void TinhChuVi(){
        cv = 2 * (dai + rong);
    }
    public void TinhDienTich(){
        dt = dai * rong;
    }
    public void InChuVi(){
        System.out.println("Chu vi hinh chu nhat: " + cv );
    }
    public void InDienTich(){
        System.out.println("Dien tich hinh chu nhat: " + dt);
    }
    }