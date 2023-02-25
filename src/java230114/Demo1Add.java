package java230114;

import java.util.ArrayList;

/**
 * @ClassName: Demo1
 * @Date: 2023/1/12 21:47
 * @Author: MOUNIN
 * @Description:
 **/
public class Demo1Add {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1, 10);
        System.out.println(list);

        ArrayList<Object> list1 = new ArrayList<>();
        list1.add(2);
        list1.add("test");

        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(3);
        list1.add(cat);
        System.out.println(list1);
    }
}
