package Bai3_;

public class qLyGDDemo {
	public static void main(String[] args) {
		qLyGD[] listgd = new qLyGD[6];
		//gdv
		listgd[0] = new gDV("m56", "25/5", 400, 10, "9999");
		listgd[1] = new gDV("m57", "25/5", 400, 10, "9999");
		listgd[2] = new gDV("m58", "25/5", 400, 10, "9999");
		//gdtt
		listgd[3] = new gDTT("m54", "26/8", 50, 5, 45,"USA" );
		listgd[4] = new gDTT("m55", "26/8", 50, 5,45,"VN" );
		listgd[5] = new gDTT("m56", "26/8", 50, 5,45,"EURO" );
		
		
		int TongSoluongGDV =0;
		int TongSoLuongGDTT =0;
		double tongDoanhThuGDTT =0;
		
		for(qLyGD gd : listgd) {
			if(gd instanceof gDV) {
				TongSoluongGDV += gd.getSoLuong();
			}else if (gd instanceof gDTT) {
				TongSoLuongGDTT += ((gDTT) gd).thanhTien();
				tongDoanhThuGDTT++;
			}
			
				
			}
			double TTBTTGDTT =  TongSoLuongGDTT/ tongDoanhThuGDTT;
			System.out.println("Tong so Luong GDV:"+TongSoluongGDV);
			System.out.println("Tong so Luong GDTT:"+TongSoLuongGDTT);
			System.out.println("TTBTTGDTT:"+TTBTTGDTT);
			System.out.println("thanh tien GDTT:"+tongDoanhThuGDTT);
		}
	}


