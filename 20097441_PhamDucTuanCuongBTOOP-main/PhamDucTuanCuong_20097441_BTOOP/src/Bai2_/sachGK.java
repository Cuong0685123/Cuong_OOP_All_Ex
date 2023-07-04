package Bai2_;

public class sachGK  extends quanLySach{
	private String tinhTrang;

	public sachGK(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXB, String tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXB);
		this.tinhTrang = tinhTrang;
	}

	public sachGK() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	
	public double thanhTien() {
		if(tinhTrang.equals("moi")) {
			return super.getSoLuong()*getDonGia();
		}else if(tinhTrang.equals("cu")) {
			return super.getSoLuong()*getDonGia()*0.5;
		}else {
			return 0;
		}
	}
	
	

	@Override
	public String toString() {
		return "sachGK [tinhTrang=" + tinhTrang + "]";
	}
	
	
	

}
