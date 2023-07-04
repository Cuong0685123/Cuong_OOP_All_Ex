package Bai2_;

public class quanLySach {
	private String maSach;
	private String ngayNhap;
	private double donGia;
	private int soLuong;
	private String nhaXB;
	public quanLySach(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXB) {
		super();
		this.maSach = maSach;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaXB = nhaXB;
	}
	public quanLySach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public String getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(String ngayNhap) {
		this.ngayNhap = ngayNhap;
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
	public String getNhaXB() {
		return nhaXB;
	}
	public void setNhaXB(String nhaXB) {
		this.nhaXB = nhaXB;
	}
	@Override
	public String toString() {
		return "quanLySach [maSach=" + maSach + ", ngayNhap=" + ngayNhap + ", donGia=" + donGia + ", soLuong=" + soLuong
				+ ", nhaXB=" + nhaXB + "]";
	}
	
	
	

}
