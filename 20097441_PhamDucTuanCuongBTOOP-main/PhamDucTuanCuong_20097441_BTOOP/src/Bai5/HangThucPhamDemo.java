package Bai5;

import java.time.LocalDate;



public class HangThucPhamDemo {
	public static void main(String[] args) {
		
		HangThucPham hangThucpham = new HangThucPham();
		hangThucpham.setTenHang("luoi heo");
		hangThucpham.setGia(900000);
		hangThucpham.setNgaySX(LocalDate.of(2022, 3, 15));
		hangThucpham.setNgayHH(LocalDate.of(2024, 5, 22));
		System.out.println(hangThucpham.checkDate());
		System.out.println("");
	}


}
