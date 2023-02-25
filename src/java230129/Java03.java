package java230129;

import java.util.ArrayList;

/**
 * @ClassName: Java01
 * @Date: 2023/1/29 19:57
 * @Author: MOUNIN
 * @Description:
 **/
public class Java03 {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(29);
        list.add(56);
        list.add(89);
        System.out.println(list);
        System.out.println();

//        int a = (int) list.remove(1);
        System.out.println(list.remove(1));  // 56

        System.out.println();
        System.out.println(list);
    }
}
