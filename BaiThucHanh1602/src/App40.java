import java.util.Scanner;
public class App40 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int ngay=scan.nextInt();
        switch(ngay){
            case 0:System.out.println("chu nhat");
            break;
            case 1:System.out.println("thu hai");
            break;
            case 2:System.out.println("thu ba");
            break;
            case 3:System.out.println("thu tu");
            break;
            case 4:System.out.println("thu nam");
            break;
            case 5:System.out.println("thu sau");
            break;
            case 6:System.out.println("thu bay");
            break;
            default:System.out.println("so ngay trong tuan sai");
            scan.close();
        }
    }
    
}
