package Bai2;


public class SVDemo {
	
	public static void main(String[] args) {
		
		SV sv1 = new SV(3854, "Cuong", 5, 7);
		SV sv2 = new SV(478, "", 16, 7);
		
		System.out.println(String.format("%4s| %-20s| %5s| %5s| %5s|", "Ma SV", "Ho Ten", "Diem LT", "Diem TH", "Diem TB"));
		System.out.println("-------------------------------------------------------");
		System.out.println(sv1.toString());
		System.out.println(sv2.toString());
		
	}
	}
