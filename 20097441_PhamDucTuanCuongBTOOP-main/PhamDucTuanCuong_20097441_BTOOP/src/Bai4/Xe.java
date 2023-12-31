package Bai4;

public class Xe {


		
		private String chuXe;
		private String loaiXe;
		private int dungTich;
		private float triGia;
		
		public Xe() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Xe(String chuXe, String loaiXe, int dungTich, float triGia) {
			super();
			this.chuXe = chuXe;
			this.loaiXe = loaiXe;
			this.dungTich = dungTich;
			this.triGia = triGia;
		}

		public String getChuXe() {
			return chuXe;
		}

		public void setChuXe(String chuXe) {
			this.chuXe = chuXe;
		}

		public String getLoaiXe() {
			return loaiXe;
		}

		public void setLoaiXe(String loaiXe) {
			this.loaiXe = loaiXe;
		}

		public int getDungTich() {
			return dungTich;
		}

		public void setDungTich(int dungTich) {
			this.dungTich = dungTich;
		}

		public float getTriGia() {
			return triGia;
		}

		public void setTriGia(float triGia) {
			this.triGia = triGia;
		}
		

		public float thueTruocba() {
			float thue = 0f;
			if (dungTich < 100) thue = (1f / 100) * triGia;
			else if (dungTich <= 200) thue = (3f / 100) * triGia;
			else thue = (5f / 100) * triGia;
			return thue;
		}

		@Override
		public String toString() {
			return String.format("%-20s| %-20s| %12d| %,20.2f| %,20.2f|", chuXe, loaiXe, dungTich, triGia, thueTruocba());
		}
		
	}



