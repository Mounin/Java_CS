package java230129;

import java.util.ArrayList;

/**
 * @ClassName: Java01
 * @Date: 2023/1/29 19:57
 * @Author: MOUNIN
 * @Description:
 **/
public class Java01 {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(29);
        list.add(56);
        list.add(89);
        list.add("abc");
        list.add(2, 100);  // 29 56 100 89 123

//        for (int i = 0; i < 10; i++) {
//            list.add(i);
//        }

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(6);
        list1.add(9);

        list.addAll(list1);
        System.out.println(list);
    }
}
