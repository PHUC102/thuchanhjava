import java.util.Scanner;
public class App35 {
    public static void main(String[] args) throws Exception {
        int firstnumber , secondnumber;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat: ");
        firstnumber = scan.nextInt();
        System.out.println("Nhap vao so hai: ");
        secondnumber = scan.nextInt();
        int minnumber = firstnumber;
        if (firstnumber > secondnumber)
        minnumber = secondnumber;
        System.out.println("So nho nhat trong hai so " + firstnumber + " va " + secondnumber + " la " + minnumber);
    scan.close();
    }
    
}
