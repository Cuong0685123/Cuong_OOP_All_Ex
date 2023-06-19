package Bai9;

import java.util.Scanner;

public class CongNhanDemo {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập số lượng công nhân: ");
	        int size = scanner.nextInt();
	        scanner.nextLine(); 

	        DanhSachCongNhan danhSachCongNhan = new DanhSachCongNhan(size);

	        for (int i = 0; i < size; i++) {
	            System.out.println("Nhập thông tin công nhân " + (i + 1) + ":");
	            System.out.print("Mã CN: ");
	            int maCN = scanner.nextInt();
	            scanner.nextLine(); 
	            System.out.print("Họ: ");
	            String ho = scanner.nextLine();
	            System.out.print("Tên: ");
	            String ten = scanner.nextLine();
	            System.out.print("Số SP: ");
	            int soSP = scanner.nextInt();
	            scanner.nextLine(); 
	            CongNhan congNhan = new CongNhan(ten, ho, ten, soSP);
	            danhSachCongNhan.themCongNhan(congNhan);
	        }
	        System.out.println("Danh sách công nhân:");
	        danhSachCongNhan.xuatThongTinCongNhan();
	        System.out.println("Số lượng công nhân: " + danhSachCongNhan.soLuongCongNhan());
	        danhSachCongNhan.xuatCongNhanLamTren200SP();
	        danhSachCongNhan.sapXepCongNhanGiamDanSP();
	        System.out.println("Danh sách công nhân sau khi sắp xếp giảm dần theo số sản phẩm:");
	        danhSachCongNhan.xuatThongTinCongNhan();

	        scanner.close();
	    }
	}



