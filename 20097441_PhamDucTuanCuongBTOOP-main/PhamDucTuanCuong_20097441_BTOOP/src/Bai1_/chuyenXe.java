package Bai1_;

public class chuyenXe {
	private String maChuyen;
	private String hoTen;
	private int soXe;
	private double doanhThu;
	public chuyenXe(String maChuyen, String hoTen, int soXe, double doanhThu) {
		super();
		this.maChuyen = maChuyen;
		this.hoTen = hoTen;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}
	public chuyenXe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaChuyen() {
		return maChuyen;
	}
	public void setMaChuyen(String maChuyen) {
		this.maChuyen = maChuyen;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getSoXe() {
		return soXe;
	}
	public void setSoXe(int soXe) {
		this.soXe = soXe;
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	@Override
	public String toString() {
		return "chuyenXe [maChuyen=" + maChuyen + ", hoTen=" + hoTen + ", soXe=" + soXe + ", doanhThu=" + doanhThu
				+ "]";
	}
	
	

}
