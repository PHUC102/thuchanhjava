package Shape;

public class Quadrilateral {
    public void kiemtra(){
        Point p = new Point();
           System.out.println("Nhap hoanh đo va tung đo (0 < hoonh đo , tung đo < 180) ");
           p.in();
           if(p.hoanhdo < 0 || p.tungdo < 0 )
           {
               p.hoanhdo = Math.abs(p.hoanhdo);
               p.tungdo = Math.abs(p.tungdo);
           }
           if(p.hoanhdo == p.tungdo && p.hoanhdo + p.tungdo == 180 )
           {
               System.out.println("\t La mot tu giac va la tu giac noi tiep ");
           }
           else 
           {
               System.out.println("\tKhong phai la tu giac ");
           }
        }
}