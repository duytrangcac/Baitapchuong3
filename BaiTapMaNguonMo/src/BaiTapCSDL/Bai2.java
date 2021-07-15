package BaiTapCSDL;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
public class Bai2 extends JFrame {
	
	public Bai2()	{
	setTitle("Quản lý bán hàng");	//Tiêu đề JFrame
	setSize(900,600);	//Kích thước của JFrame
	setDefaultCloseOperation(EXIT_ON_CLOSE);//Thoát chương trình khi click	nút exit
	setLocationRelativeTo(null);	//Canh giữa màn hình
	setResizable(false);	//không cho phép thay đổi kích thước JFrame
	getContentPane().setLayout(new FlowLayout());
	
	JPanel panel = new JPanel();
	getContentPane().add(panel);
	}
	public static void main(String[] args)throws SQLException {
		ConnectSQL conn= new ConnectSQL("QLbanhang");
	   	 Statement statement = (Statement) conn.connect.createStatement();
	   	 new Bai2().setVisible(true);
	}
}
