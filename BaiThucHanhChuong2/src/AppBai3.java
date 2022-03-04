import java.util.Scanner;
public class AppBai3 {
    public static void main(String[] args) throws Exception {
        double year;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten");
        name = sc.nextLine();
        System.out.println("Nhap vao so nam");
        year = sc.nextDouble();
        double age=2022-year;
        if(age<16)
          System.out.println("Bạn "+name+" o do tuoi vi thanh nien");
        if(age>=16&&age<18)
          System.out.println("Bạn "+name+" o do tuoi truong thanh");
        if(age>=18)
          System.out.println("Bạn "+name+" da gia");
          sc.close();
      }
}