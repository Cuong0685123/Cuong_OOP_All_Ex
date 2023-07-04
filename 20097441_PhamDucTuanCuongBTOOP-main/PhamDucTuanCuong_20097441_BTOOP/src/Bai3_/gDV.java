package Bai3_;

public class gDV extends qLyGD {
	private String loaiVang;

	public gDV(String maGD, String ngayGD, double donGia, int soLuong, String loaiVang) {
		super(maGD, ngayGD, donGia, soLuong);
		this.loaiVang = loaiVang;
	}

	public gDV() {
		super();
		// TODO Auto-generated constructor stub
	}

	public gDV(String maGD, String ngayGD, double donGia, int soLuong) {
		super(maGD, ngayGD, donGia, soLuong);
		// TODO Auto-generated constructor stub
	}

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}
	
	public double thanhTien() {
		return getSoLuong()*getDonGia();
	}

	@Override
	public String toString() {
		return "gDV [loaiVang=" + loaiVang + "]";
	}
	
	

}
