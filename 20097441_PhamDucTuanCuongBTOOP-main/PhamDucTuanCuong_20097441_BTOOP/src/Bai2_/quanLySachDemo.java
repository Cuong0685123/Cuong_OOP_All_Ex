package Bai2_;

public class quanLySachDemo {
	public static void main(String[] args) {
		quanLySach[] listsach = new quanLySach[6];
		//sachGK
		listsach[0] = new sachGK("m548", "58/5", 2500, 5, "hokage", "moi");
		listsach[1] = new sachGK("m549", "58/5", 2500, 5, "hokage", "cu");
		listsach[2] = new sachGK("m547", "58/5", 2500, 5, "hokage", "moi");
		//sachTK
		listsach[3] = new sachTK("m874", "22/8", 3500, 9, "naruto", 0.5);
		listsach[4] = new sachTK("m875", "22/8", 3500, 9, "naruto", 0.5);
		listsach[5] = new sachTK("m876", "22/8", 3500, 9, "naruto", 0.5);
		
		double tongTien = 0;
		double tongTiensachGK =0;
		double tongTiensachTK =0;
		int soLuongsachTK =27;
		
		for(quanLySach sach : listsach) {
			if(sach instanceof sachGK) {
				tongTiensachGK += ((sachGK) sach).thanhTien();
			}else if (sach instanceof sachTK) {
				tongTiensachTK += ((sachTK) sach).thanhTien();
				tongTien++;
			}
			double TBDGSTK = tongTiensachTK/soLuongsachTK;
			
			System.out.println("tong thanh tien sach tk:"+tongTiensachTK);
			System.out.println("tong thanh tien sach gk"+tongTiensachGK);
			System.out.println("TBDGSTK:"+TBDGSTK);
		}
	}

}
