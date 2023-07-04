package Bai5_;

public class khachHangVN extends quanLyDien {
	private String doiTuong;
	private int dinhMuc;
	private double soKW;
	public khachHangVN(String maKH, String hoTen, String ngayLap, int soKW, double donGia, String doiTuong,
			int dinhMuc) {
		super(maKH, hoTen, ngayLap, soKW, donGia);
		this.doiTuong = doiTuong;
		this.dinhMuc = dinhMuc;
	}
	public khachHangVN() {
		super();
		// TODO Auto-generated constructor stub
	}
	public khachHangVN(String maKH, String hoTen, String ngayLap, int soKW, double donGia) {
		super(maKH, hoTen, ngayLap, soKW, donGia);
		// TODO Auto-generated constructor stub
	}
	public String getDoiTuong() {
		return doiTuong;
	}
	public void setDoiTuong(String doiTuong) {
		this.doiTuong = doiTuong;
	}
	public int getDinhMuc() {
		return dinhMuc;
	}
	public void setDinhMuc(int dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
	
	public double thanhTien() {
		if(soKW < dinhMuc) {
			return getSoKW()*getDonGia();
		}else if(soKW > dinhMuc) {
			return getSoKW()*getDonGia()+ (getSoKW()+getDinhMuc())*getDonGia()*2.5;
		}else {
			return 0;
		}
	}
	

	
	
	@Override
	public String toString() {
		return "khachHangVN [doiTuong=" + doiTuong + ", dinhMuc=" + dinhMuc + "]";
	}
	
	

}
