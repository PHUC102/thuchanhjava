import java.util.Scanner;
public class App47 {
    public static void main(String[] args) throws Exception {
        int number, sum = 0 ;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("nhap vao so nguyen bat ky: ");
            number = scan.nextInt();
            sum += number;
        } while (sum<100);
            System.out.println("tong cac so nguyen vua nhap =" +sum);
            scan.close();
        }
    
}
