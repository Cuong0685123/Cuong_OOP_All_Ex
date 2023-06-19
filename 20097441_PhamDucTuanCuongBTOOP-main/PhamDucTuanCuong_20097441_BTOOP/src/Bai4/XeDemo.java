package Bai4;

public class XeDemo {

	
	public static void main(String[] args) {
		
		Xe xe1 = new Xe("Pham Duc Tuan Cuong", "Honda Lead", 185, 32000000);
		
		Xe xe2 = new Xe("Nguyen Ngan", "Honda Wave", 90, 25000000);
		
		Xe xe3 = new Xe("Tran Thien", "KTM Duke 457", 390, 2150000);
			
		System.out.println(String.format("%-20s| %-20s| %12s| %20s| %20s|", "Ten chu xe", "Ten xe", "Dung tich", "Tri gia", "Thue truoc ba"));
		System.out.println("=====================================================================================================");
		System.out.println(xe1.toString());
		System.out.println(xe2.toString());
		System.out.println(xe3.toString());
		
	}

}
