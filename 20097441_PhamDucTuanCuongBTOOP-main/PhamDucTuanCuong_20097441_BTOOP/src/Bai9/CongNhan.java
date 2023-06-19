package Bai9;

public class CongNhan {
	private String maCN;
	private String maHo;
	private String ten;
	private int mSoSP;

	
	public CongNhan() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CongNhan(String maCN, String maHo, String ten, int mSoSP) {
		super();
		this.maCN = maCN;
		this.maHo = maHo;
		this.ten = ten;
		this.mSoSP = mSoSP;
	}


	public String getMaCN() {
		return maCN;
	}


	public void setMaCN(String maCN) {
		try {
			if(maCN != null)
				this.maCN = maCN;
		} catch (Exception e) {
			System.out.println("sai");
		}
		
	}


	public String getMaHo() {
		return maHo;
	}


	public void setMaHo(String maHo) {
		try {
			if(maHo != null)
				this.maHo = maHo;
		} catch (Exception e) {
			System.out.println("sai");
		}
		
	}


	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		try {
			if(ten !=null)
				this.ten = ten;
		} catch (Exception e) {
			System.out.println("sai");
		}
		
	}


	public int getmSoSP() {
		return mSoSP;
	}


	public void setmSoSP(int mSoSP) {
		try {
			if(mSoSP >0)
				this.mSoSP = mSoSP;
		} catch (Exception e) {
			System.out.println("sai");
		}
		
		
	}
	
	 public double tinhLuong() {
	        double donGia;
	        if (mSoSP >= 1 && mSoSP <= 199) {
	            donGia = 0.5;
	        } else if (mSoSP >= 200 && mSoSP <= 399) {
	            donGia = 0.55;
	        } else if (mSoSP >= 400 && mSoSP <= 599) {
	            donGia = 0.6;
	        } else {
	            donGia = 0.65;
	        }
	        return mSoSP * donGia;
		 
		 
	 }


	@Override
	public String toString() {
		return "CongNhan [maCN=" + maCN + ", maHo=" + maHo + ", ten=" + ten + ", mSoSP=" + mSoSP + "]";
	}
	 


	
	    
	}

	
	


	
	



	
	
	

