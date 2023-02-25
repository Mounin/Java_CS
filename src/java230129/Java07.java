package java230129;

import java.util.ArrayList;

/**
 * @ClassName: Java01
 * @Date: 2023/1/29 19:57
 * @Author: MOUNIN
 * @Description:
 **/
public class Java07 {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(29);
        list.add(56);
        list.add(89);
        list.add(200);
        list.add(301);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("***************");
//        int[] a = new int[]{1, 2, 3, 4};
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }

//        for (Object l : list) {
//            System.out.println(l);
//        }

        list.forEach((e) -> {
            System.out.println(e);
        });
    }
}
