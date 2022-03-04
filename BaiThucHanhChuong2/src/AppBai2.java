import java.util.Scanner;
public class AppBai2 {
    public static void main(String[] args) throws Exception {
        double num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot so bat ky");
        num1 = sc.nextDouble();
        if(num1%2==0) System.out.println(num1 +" la so chan ");
        else System.out.println(num1 +" la so le ");
        sc.close();
    }
}