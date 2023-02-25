package java230129;

import java.util.ArrayList;

/**
 * @ClassName: Java01
 * @Date: 2023/1/29 19:57
 * @Author: MOUNIN
 * @Description:
 **/
public class Java04 {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(29);
        list.add(56);
        list.add(89);
        list.add(200);
        System.out.println("修改前：" + list);

//        System.out.println(list.set(1, 100));  // 56
        list.set(1, 100);

        System.out.println("修改后：" + list);
    }
}
