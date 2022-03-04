import java.util.Scanner;
public class AppBai11 {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      System.out.print("Nhap so phan tu cua mang: ");
      int n = sc.nextInt();
      int [] arr = new int [n];
      System.out.print("Nhap cac phan tu cua mang: \n");
      for (int i = 0; i < n; i++) {
          System.out.printf("a[%d] = ", i);
          arr[i] = sc.nextInt();
      }
      System.out.println("Day so truoc xap xep tang dan: ");
      show(arr);
      System.out.println();
      sortASC(arr);
      System.out.println("Day so duoc xap xep tang dan: ");
      show(arr);
      sc.close();
    }
    public static void sortASC(int [] arr) {
      int temp = arr[0];
      for (int i = 0 ; i < arr.length - 1; i++) {
          for (int j = i + 1; j < arr.length; j++) {
              if (arr[i] > arr[j]) {
                  temp = arr[j];
                  arr[j] = arr[i];
                  arr[i] = temp;
              }
          }
      }
  }
    public static void show(int [] arr) {
      for (int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + " ");
            
    }
}
}
