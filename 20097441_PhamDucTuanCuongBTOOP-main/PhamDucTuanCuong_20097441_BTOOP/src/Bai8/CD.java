package Bai8;

public class CD {
	private int maCD;
	private String tenCD;
	private int soBN;
	private double GT;
	
	
	public CD() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CD(int maCD, String tenCD, int soBN, double gT) {
		super();
		this.maCD = maCD;
		this.tenCD = tenCD;
		this.soBN = soBN;
		GT = gT;
	}


	public int getMaCD() {
		return maCD;
	}


	public void setMaCD(int maCD) {
		try {
			if(maCD > 0) {
				this.maCD = 99999;
			}
			this.maCD = maCD;
		} catch (Exception e) {
			System.out.println("sai nhap lai");
		}
	}


	public String getTenCD() {
		return tenCD;
	}


	public void setTenCD(String tenCD) {
		try {
			if(tenCD != null) {
				this.tenCD = tenCD;
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}


	public int getSoBN() {
		return soBN;
	}


	public void setSoBN(int soBN) {
		try {
			if(soBN > 0) {
				this.soBN = soBN;
			}
		} catch (Exception e) {
			System.out.println("sai");
		}
		
	}


	public double getGT() {
		return GT;
	}


	public void setGT(double gT) {
		try {
			if(gT > 0) {
				this.GT = gT;
			}
		} catch (Exception e) {
			System.out.println("sai");
		}
		
	}


	@Override
	public String toString() {
		return "CD [maCD=" + maCD + ", tenCD=" + tenCD + ", soBN=" + soBN + ", GT=" + GT + "]";
	}
	
	
	
	

}
