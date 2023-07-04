package Bai1_;

public class chuyenXeNT  extends chuyenXe{
	private int soTuyen;
	private int soKM;
	public chuyenXeNT(String maChuyen, String hoTen, int soXe, double doanhThu, int soTuyen, int soKM) {
		super(maChuyen, hoTen, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKM = soKM;
	}
	public chuyenXeNT() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}
	public int getSoKM() {
		return soKM;
	}
	public void setSoKM(int soKM) {
		this.soKM = soKM;
	}
	@Override
	public String toString() {
		return "chuyenXeNT [soTuyen=" + soTuyen + ", soKM=" + soKM + "]";
	}
	
	

}
