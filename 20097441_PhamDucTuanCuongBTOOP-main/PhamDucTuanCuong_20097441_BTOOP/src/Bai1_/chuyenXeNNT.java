package Bai1_;

public class chuyenXeNNT extends chuyenXe {
	private String noiDen;
	private int ngayDi;
	public chuyenXeNNT(String maChuyen, String hoTen, int soXe, double doanhThu, String noiDen, int ngayDi) {
		super(maChuyen, hoTen, soXe, doanhThu);
		this.noiDen = noiDen;
		this.ngayDi = ngayDi;
	}
	public chuyenXeNNT() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public int getNgayDi() {
		return ngayDi;
	}
	public void setNgayDi(int ngayDi) {
		this.ngayDi = ngayDi;
	}
	@Override
	public String toString() {
		return "chuyenXeNNT [noiDen=" + noiDen + ", ngayDi=" + ngayDi + "]";
	}
	
	
	

}
