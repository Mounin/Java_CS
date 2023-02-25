package java230129;

import java.util.ArrayList;

/**
 * @ClassName: Java01
 * @Date: 2023/1/29 19:57
 * @Author: MOUNIN
 * @Description:
 **/
public class Java05 {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(29);
        list.add(56);
        list.add(89);
        list.add(200);
        list.add(300);
        list.add(400);
        System.out.println(list);

        list.set(2, 100);  // 56 100 200

        System.out.println(list.subList(1, 4));
    }
}
