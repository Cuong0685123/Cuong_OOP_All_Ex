package Bai5_;

public class khachHangNN extends quanLyDien {
	private String quocTich;

	public khachHangNN(String maKH, String hoTen, String ngayLap, int soKW, double donGia, String quocTich) {
		super(maKH, hoTen, ngayLap, soKW, donGia);
		this.quocTich = quocTich;
	}

	public khachHangNN() {
		super();
		// TODO Auto-generated constructor stub
	}

	public khachHangNN(String maKH, String hoTen, String ngayLap, int soKW, double donGia) {
		super(maKH, hoTen, ngayLap, soKW, donGia);
		// TODO Auto-generated constructor stub
	}

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	@Override
	public String toString() {
		return "khachHangNN [quocTich=" + quocTich + "]";
	}
	
	

}
