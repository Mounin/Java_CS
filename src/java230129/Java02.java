package java230129;

import java.util.ArrayList;

/**
 * @ClassName: Java01
 * @Date: 2023/1/29 19:57
 * @Author: MOUNIN
 * @Description:
 **/
public class Java02 {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(29);
        list.add(56);
        System.out.println("********");
        System.out.println(list.add(89));
        Integer a = (Integer) list.get(2);
        System.out.println("********");
        System.out.println(a);
        System.out.println("********");
        System.out.println(list.indexOf(56));
    }
}
