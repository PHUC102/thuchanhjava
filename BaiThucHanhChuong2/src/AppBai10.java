import java.util.Scanner;
public class AppBai10 {
    public static void main(String[] args) throws Exception {
        String chuoi;
        char Kytu;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        do {
          System.out.println("Nhap vao 1 choi bat ky: ");
          chuoi = sc.nextLine();
        } while (chuoi.length() > 80);
          
        System.out.println("Nhap vao ky tu can dem so lan xuat hien: ");
        Kytu = sc.next().charAt(0);
          
        for (int i = 0; i < chuoi.length(); i++) {
          if (Kytu == chuoi.charAt(i)) {
              count++;
          }
      }
          
        System.out.println("So lan xuat hien cua ky tu " + Kytu +
          " trong chuoi " + chuoi + " = " + count); 
          sc.close();

    }
      
    
}
