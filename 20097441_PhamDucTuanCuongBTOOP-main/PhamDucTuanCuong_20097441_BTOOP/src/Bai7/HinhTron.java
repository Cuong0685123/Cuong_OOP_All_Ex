package Bai7;

public class HinhTron extends ToaDo {
	private ToaDo tam;
	private double banKinh;

	public HinhTron(float x, float y, ToaDo tam, double banKinh) {
		super(x, y);
		this.tam = tam;
		this.banKinh = banKinh;
	}

	public HinhTron() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ToaDo getTam() {
		return tam;
	}

	public void setTam(ToaDo tam) {
		this.tam = tam;
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	public double tinhdt() {
		return 3.14 * (banKinh*banKinh);
		
	}
	public double tinhcv() {
		return 2*3.14*banKinh;
	}

	@Override
	public String toString() {
		return "HinhTron [tam=" + tam + ", banKinh=" + banKinh + ",dientich=" +tinhdt()+ ",chuvi=" +tinhcv()+ "]";
	}

}
