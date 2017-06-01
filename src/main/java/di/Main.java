package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by DELL on 06/01/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        KhongPhuThuoc khongPhuThuoc = context.getBean("khongPhuThuoc",KhongPhuThuoc.class);
        int sum = khongPhuThuoc.add(3,2);
        System.out.println("Sum: "+sum);
    }
}
