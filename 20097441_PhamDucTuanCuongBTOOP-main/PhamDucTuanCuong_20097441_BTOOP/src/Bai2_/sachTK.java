package Bai2_;

public class sachTK extends quanLySach {
	private double thue;

	public sachTK(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXB, double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXB);
		this.thue = thue;
	}

	public sachTK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getThue() {
		return thue;
	}

	public void setThue(int thue) {
		this.thue = thue;
	}
	
	public double thanhTien() {
		return getDonGia()*getSoLuong()+thue;
				
	}

	@Override
	public String toString() {
		return "sachTK [thue=" + thue + "]";
	}
	
	

}
