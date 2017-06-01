package di;

/**
 * Created by DELL on 06/01/17.
 */
public class KhongPhuThuoc {
    private PhuThuoc1 phuThuoc1;

    public int add(int a,int b){
        return phuThuoc1.add(a,b);
    }

    public void setPhuThuoc1(PhuThuoc1 phuThuoc1) {
        this.phuThuoc1 = phuThuoc1;
    }
}
