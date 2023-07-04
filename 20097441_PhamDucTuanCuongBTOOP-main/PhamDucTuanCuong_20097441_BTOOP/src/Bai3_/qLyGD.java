package Bai3_;

public class qLyGD {
	private String maGD;
	private String ngayGD;
	private double donGia;
	private int soLuong;
	public qLyGD(String maGD, String ngayGD, double donGia, int soLuong) {
		super();
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	public qLyGD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaGD() {
		return maGD;
	}
	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}
	public String getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(String ngayGD) {
		this.ngayGD = ngayGD;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		return "qLyGD [maGD=" + maGD + ", ngayGD=" + ngayGD + ", donGia=" + donGia + ", soLuong=" + soLuong + "]";
	}
	
	
	

}
