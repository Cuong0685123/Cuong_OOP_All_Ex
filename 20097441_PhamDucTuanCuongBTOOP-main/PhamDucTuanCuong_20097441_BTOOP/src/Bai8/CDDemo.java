package Bai8;

import java.util.List;
import java.util.Scanner;

public class CDDemo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        CDlist cdList = new CDlist(10); 

	        int choice;
	        do {
	            System.out.println("===== MENU =====");
	            System.out.println("1. Thêm CD");
	            System.out.println("2. Số lượng CD");
	            System.out.println("3. Sắp xếp danh sách theo giá thành giảm dần");
	            System.out.println("4. Sắp xếp danh sách theo tựa CD tăng dần");
	            System.out.print("Nhập lựa chọn của bạn: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Nhập mã CD: ");
	                    int maCD = scanner.nextInt();
	                    scanner.nextLine(); 
	                    System.out.print("Nhập tựa CD: ");
	                    String tuaCD = scanner.nextLine();
	                    System.out.print("Nhập số bài hát: ");
	                    int soBaiHat = scanner.nextInt();
	                    System.out.print("Nhập giá thành: ");
	                    double giaThanh = scanner.nextDouble();
	                    CD cd = new CD(maCD, tuaCD, soBaiHat, giaThanh);
	                    boolean themThanhCong = cdList.themCD(cd);
	                    if (themThanhCong) {
	                        System.out.println("Thêm CD thành công!");
	                    } else {
	                        System.out.println("Thêm CD không thành công!");
	                    }
	                    break;
	                case 2:
	                	
	                    System.out.println("Số lượng CD: " + cdList.soLuongCD());
	                    break;
	                case 3:
	                	 cdList.sapXepGD();
	                     System.out.println("Danh sách CD đã được sắp xếp theo giá thành giảm dần.");
	                     break;
	                case 4:
	                	 cdList.sapXepTD();;
	                     System.out.println("Danh sách CD đã được sắp xếp theo giá thành tang dan.");
	                     break;
 
	            }
	        } while (choice != 0);

	        scanner.close();
	    }
	}

