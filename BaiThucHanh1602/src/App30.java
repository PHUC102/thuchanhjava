import java.util.Scanner;
public class App30 {
    public static void main(String[] args) throws Exception {
        int n, SoDu, tong = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong bat ky: ");
        n = scan.nextInt();
        while (n>0) {
            SoDu = n % 10;
            n = n / 10;
            tong += SoDu;
        }
        System.out.println("Tong cac chu so =" + tong);
        scan.close();
    }
}
