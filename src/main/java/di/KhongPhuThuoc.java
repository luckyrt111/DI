package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by DELL on 06/01/17.
 */
@Component
public class KhongPhuThuoc {
    @Autowired
    private PhuThuoc1 phuThuoc1;

    public KhongPhuThuoc(PhuThuoc1 phuThuoc1) {
        this.phuThuoc1 = phuThuoc1;
    }

    public int add(int a, int b){
        return phuThuoc1.add(a,b);
    }


}
