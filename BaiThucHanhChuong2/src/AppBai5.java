import java.util.Scanner;
public class AppBai5 {
    public static void main(String[] args) throws Exception {
        int number, sum = 0;
        Scanner sc = new Scanner(System.in);
        do{
          System.out.println("Nap vao so nguyen : ");
          number = sc.nextInt();
          sum += number;
        }while (sum<100); 
        System.out.println("Tong cac so nguyen vua nhap = " + sum);
        sc.close();
    }
}
