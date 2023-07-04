package Bai5_;

public class quanLyDien {
	private String maKH;
	private String hoTen;
	private String ngayLap;
	private double soKW;
	private double donGia;
	public quanLyDien(String maKH, String hoTen, String ngayLap, int soKW, double donGia) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.ngayLap = ngayLap;
		this.soKW = soKW;
		this.donGia = donGia;
	}
	public quanLyDien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(String ngayLap) {
		this.ngayLap = ngayLap;
	}
	public double getSoKW() {
		return soKW;
	}
	public void setSoKW(int soKW) {
		this.soKW = soKW;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	@Override
	public String toString() {
		return "quanLyDien [maKH=" + maKH + ", hoTen=" + hoTen + ", ngayLap=" + ngayLap + ", soKW=" + soKW + ", donGia="
				+ donGia + "]";
	}
	
	

}
