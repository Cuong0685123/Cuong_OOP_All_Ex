package Bai2;

public class SV {
		private int maSV;
		private String hoTen;
		private float diemLT;
		private float diemTH;
		
		public SV() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public SV(int maSV, String hoTen, float diemLT, float diemTH) {
			super();
			this.maSV = maSV;
			this.hoTen = hoTen;
			this.diemLT = diemLT;
			this.diemTH = diemTH;
		}

		
		public int getMaSV() {
			return maSV;
		}

		public void setMaSV(int maSV) {
			if (maSV < 0) 
				this.maSV = 0;	
			else 
				this.maSV = maSV;
		}

		public String getHoTen() {
			return hoTen;
		}

		public void setHoTen(String hoTen) {
			if (hoTen.equals(""))
				this.hoTen = "nhap ho ten";
			else
				this.hoTen = hoTen;
		}

		public float getDiemLT() {
			return diemLT;
		}

		public void setDiemLT(float diemLT) {
			if (diemLT < 0 || diemLT > 10)
				this.diemLT = 0;
			else
				this.diemLT = diemLT;
		}

		public float getDiemTH() {
			return diemTH;
		}

		public void setDiemTH(float diemTH) {
			if (diemTH < 0 || diemTH > 10)
				this.diemTH = 0;
			else
				this.diemTH = diemTH;
		}
		
		public float diemTB() {
			return (diemLT + diemTH)/2;
		}

		@Override
		public String toString() {
			return "SV [maSV=" + maSV + ", hoTen=" + hoTen + ", diemLT=" + diemLT + ", diemTH=" + diemTH + "]";
		}

		
		
	}

