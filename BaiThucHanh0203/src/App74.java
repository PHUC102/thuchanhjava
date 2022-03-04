import java.util.Scanner;

public class App74 {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Nhap vao so phan tu cua mang: ");
            n = scan.nextInt();
        }
        while (n<0);
        int a[] = new int[n];
        System.out.println("Nhap cac phan tu cho mang: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print("Nhap phan tu thu " +i +": ");
            a[i] = scan.nextInt();
        }
        double Tong =0;
        for (int i = 0; i < n; i++)
        {
            if (a[i] %2 ==0)
            {
                Tong+=a[i];
            }
        }
        System.out.println("Tong cac so chan: " +Tong);
        scan.close();
    
        }
}
