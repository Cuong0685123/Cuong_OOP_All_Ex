package Bai3_;

public class gDTT extends qLyGD {
	private String loaiTien;
	private double tiGia;

	public gDTT(String maGD, String ngayGD, double donGia, int soLuong, double tiGia, String loaiTien) {
		super(maGD, ngayGD, donGia, soLuong);
		this.loaiTien = loaiTien;
	}

	public gDTT() {
		super();
		// TODO Auto-generated constructor stub
	}

	public gDTT(String maGD, String ngayGD, double donGia, int soLuong) {
		super(maGD, ngayGD, donGia, soLuong);
		// TODO Auto-generated constructor stub
	}

	public String getLoaiTien() {
		return loaiTien;
	}

	public void setLoaiTien(String loaiTien) {
		this.loaiTien = loaiTien;
	}
	
	public double thanhTien() {
		if(loaiTien.equals("USA")|| loaiTien.equals("EURO")) {
			return super.getSoLuong()*getDonGia()*tiGia;
		}else if (loaiTien.equals("VN")) {
			return super.getSoLuong()*getDonGia();
		}else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "gDTT [loaiTien=" + loaiTien + ", tiGia=" + tiGia + "]";
	}

	
	}
	
	
	


