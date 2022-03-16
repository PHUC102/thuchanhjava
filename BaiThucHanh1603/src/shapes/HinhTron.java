package shapes;

import java.util.Scanner;

public class HinhTron {
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;
    public void NhapBanKinh(){
        System.out.println("Hay nhap vao ban kinh hinh tron: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
        sc.close();
    }
    public void TinhChuVi(){
        cv = 2 * PI * r;
    }
    public void TinhDienTich(){
        dt = PI * r * r;
    }
    public void InChuVi(){
        System.out.println("chu vi hinh tron: " + cv );
    }
    public void InDienTich(){
        System.out.println("Dien tich hinh tron :" + dt);
    }
}