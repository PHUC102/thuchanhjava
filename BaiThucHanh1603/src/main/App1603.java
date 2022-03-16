package main;

import shapes.Person;
import shapes.SinhVien;
import shapes.PhuongTrinhBacHai;
public class App1603 {
  public static void  main(String args[]){
    Person ps = new Person();
    SinhVien sv = new SinhVien();
    PhuongTrinhBacHai ptb2 = new PhuongTrinhBacHai();
    ps.NhapThongTin();
    ps.InThongTin();
    System.out.println();
    sv.NhapThongTin();
    sv.InThongTin();
    System.out.println();
    ptb2.NhapCacHeSo();
    ptb2.GiaiPhuongTrinh();
  }
}