package Bai9;

public class DanhSachCongNhan {
	int count;
	private CongNhan[] ls, congNhanArr;
	public DanhSachCongNhan(int n) {
		ls = new CongNhan[n];
		count = 0;
	}
	public void tangKT() {
		CongNhan[] cn = new CongNhan[ls.length*2];
		ls = cn;
	}
	
	public boolean themCongNhan(CongNhan cn) {
		if(count == ls.length) {
			tangKT();
		}
		for(int i = 0; i< count; i++) {
			if(ls[i].getMaCN()== cn.getMaCN()) {
				return false;
			}
		}
		ls[count] = cn;
		count ++;
		return true;
	}
	
	public void xuatThongTinCongNhan() {
        for (int i = 0; i < count; i++) {
            System.out.println(congNhanArr[i]);
        }
    }
	public int soLuongCongNhan() {
        return count;
    }
	public void xuatCongNhanLamTren200SP() {
        System.out.println("Công nhân làm trên 200 sản phẩm:");
        for (int i = 0; i < count; i++) {
            if (congNhanArr[i].getmSoSP() > 200) {
                System.out.println(congNhanArr[i]);
            }
        }
    }
	public void sapXepCongNhanGiamDanSP() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (congNhanArr[i].getmSoSP() < congNhanArr[j].getmSoSP()) {
                    CongNhan temp = congNhanArr[i];
                    congNhanArr[i] = congNhanArr[j];
                    congNhanArr[j] = temp;
                }
            }
        }
    }
}
	
