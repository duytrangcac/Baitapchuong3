package BaiTapCSDL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Bai1 {
	public static void main(String[] args)throws SQLException {
		ConnectSQL conn= new ConnectSQL("QLsanpham");
   	 Statement statement = (Statement) conn.connect.createStatement();
   	 int n;
	 Scanner sn= new Scanner(System.in);
   	 while(true) {
   		 System.out.println("vui lòng chọn:\n1.Xem sản phẩm\n2.Nhập sản phẩm\n3.Nhập loại sản phẩm\n4.Thoát");
   		 ResultSet rs;
   		 System.out.print("Bạn chọn:");
   		 n=sn.nextInt();
   		 switch(n)
   		 {
   		 case 1:
   			 rs=statement.executeQuery("Select MaSp,TenSP,TenLoaiSP From SanPham INNER JOIN LoaiSanPham "
	        	 		+ "ON SanPham.MaLoaiSP=LoaiSanPham.MaLoaiSP");
	        	
	        	 while (rs.next()) {
	                 System.out.println("\nMã sản phẩm: "+ rs.getString(1) + "\nTên sản phẩm: " + rs.getString(2) 
	                         + "\nLoại sản phẩm: " + rs.getString(3)+"\n\n");
	             }
	        	 break;
   		 case 3:
   			 try {
   			 String malsp1=sn.nextLine();
   			 System.out.println("Nhập mã loại sản phẩm:");
   			 String malsp=sn.nextLine();
   			 System.out.println("Nhập tên loại sản phẩm:");
   			 String tenlsp=sn.nextLine();
   			 statement.executeUpdate("insert into Loaisanpham values('"+malsp+"',N'"+tenlsp+"')");
   			 System.out.println("Thêm thành công\n");
   			 }catch(Exception ex) {
   				 System.out.println(ex.getMessage());
   			 }
   			 break;
   		 case 2:
   			 try {
   				 String malsp2=sn.nextLine();
       			 System.out.println("Nhập mã sản phẩm:");
       			 String masp=sn.nextLine();
       			 System.out.println("Nhập tên sản phẩm:");
       			 String tensp=sn.nextLine();
       			 System.out.println("Nhập nhà sản xuất:");
       			 String nhasx=sn.nextLine();
       			 System.out.println("Nhập mã loại sản phẩm:");
       			 String maloaisp=sn.nextLine();
       			 statement.executeUpdate("insert into sanpham values('"+masp+"',N'"+tensp+"',N'"+nhasx+"',N'"+maloaisp+"')");
       			 System.out.println("Thêm thành công");
       			 }catch(Exception ex) {
       				 System.out.println(ex.getMessage());
       			 }
       			 break;
   		 case 4:
   			 conn.connect.close();
   			 return;
   			 
   			 
   		 }
   	 	}
   	   	 
}
}
