import java.util.Scanner;

public class App81 {
    public static void main(String[] args) throws Exception {
    int m,n;
    Scanner scan = new Scanner(System.in);
    System.out.println("Nhap vao so dong cua ma tran: ");
    m = scan.nextInt();
    System.out.println("Nhap vao so cot cua ma tran: ");
    n = scan.nextInt();
    int A[] [] = new int[m] [n] ;
    System.out.println("Nhap cac phan tu cho ma tran: ");
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++) {
            System.out.println("A[" + i + "][" + j + "]=");
            A [i] [j] = scan.nextInt();
        }
    }
    int max = A [0] [0];
    for (int i = 0; i < m; i++){
        for (int j = 0; j < n; j++){
            if (max < A[i] [j]){
                max = A[i][j];
            }
        }
    }
    System.out.println("Phan tu lon nhat trong ma tran = " + max);
    scan.close();
    }
}