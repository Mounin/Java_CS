package java230218.demo;

/**
 * @ClassName: Test
 * @Date: 2023/2/18 12:39
 * @Author: MOUNIN
 * @Description:
 **/
public class Test {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "tom";
        stu.age = 18;
        String info = stu.say();
        System.out.println(info);
        System.out.println(stu.say());
    }
}



