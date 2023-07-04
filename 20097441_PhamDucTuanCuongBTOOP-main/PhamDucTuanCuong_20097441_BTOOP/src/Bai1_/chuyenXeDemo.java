package Bai1_;

public class chuyenXeDemo {
	public static void main(String[] args) {
		chuyenXe[] listchuyen = new chuyenXe[4];
		//chuyenxeNT
		listchuyen[0] = new chuyenXeNT("M258", "oke", 587, 40000, 5, 50);
		listchuyen[1] = new chuyenXeNT("M259", "oke", 587, 40000, 5, 50);
		//chuyenxeNNT
		listchuyen[2] = new chuyenXeNNT("M547", "kw", 5, 6000, "Vinh ha Long", 58);
		listchuyen[3] = new chuyenXeNNT("M548", "kw", 5, 6000, "Vinh ha Long", 58);
		
		double tongDoanhThuChuyenXe =0;
		double tongDoanhThuXeNT = 0;
		double tongDoanhThuXeNNT = 0;
		
		for(chuyenXe chuyen : listchuyen) {
			tongDoanhThuChuyenXe += chuyen.getDoanhThu();
		if(chuyen instanceof chuyenXeNT) {
			tongDoanhThuXeNT += chuyen.getDoanhThu();
			}else if(chuyen instanceof chuyenXeNNT) {
				tongDoanhThuXeNNT += chuyen.getDoanhThu();
			}	
			}
		System.out.println("Tong doanh thu tat ca cac chuyen xe:"+tongDoanhThuChuyenXe);
		System.out.println("Tong doanh thu chuyen xe NT:"+tongDoanhThuXeNT);
		System.out.println("Tong doanh thu chuyen xe NNT:"+tongDoanhThuXeNNT);
	}

}
