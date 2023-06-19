package Bai8;


public class CDlist {
	int count;
	CD[] ls;

	public CDlist(int n) {
		ls = new CD[n];
		count = 0;
	}

	public void tangKT() {
		CD[] tam = new CD[ls.length * 2];
		System.arraycopy(ls, 0, tam, 0, count);
		ls = tam;
	}

	public boolean themCD(CD cd) {
		if (count == ls.length) {
			tangKT();
		}
		for (int i = 0; i < count; i++) {
			if (ls[i].getMaCD() == cd.getMaCD()) {
				return false;
			}
		}
		ls[count] = cd;
		count++;
		return true;
	}

	public int inKetQua() {
		int countCD = 0;
		for (CD c : ls) {
			if (c != null) {
				countCD++;
			}
		}
		return countCD;
	}
	public double soLuongCD() {
		double soLuongCD = 0;
		for(CD c : ls) {
			soLuongCD += c.getMaCD(); 
		}
		return soLuongCD;
	}
	public double tongGT() {
		double tong = 0;
		for(CD c : ls) {
			tong += c.getGT(); 
		}
		return tong;
	}
	public void sapXepTD() {
		for( int i = 0; i <count-1; i++) {
			for(int j = i+1; j< count; j++ ) {
				if(ls[i].getMaCD() > ls[j].getMaCD()) {
					CD tam = ls[i];
					ls[j] = ls[i];
					ls[j] = tam;
				}
			}
		}
	}
	public void sapXepGD() {
		for( int i = 0; i < count-1; i++) {
			for(int j = i+1; j< count; j++ ) {
				if(ls[i].getMaCD() < ls[j].getMaCD()) {
					CD tam = ls[i];
					ls[j] = ls[i];
					ls[j] = tam;
				}
			}
		}
	}
}
