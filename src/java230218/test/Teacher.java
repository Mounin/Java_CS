package java230218.test;

/**
 * @ClassName: Teacher
 * @Date: 2023/2/16 16:07
 * @Author: MOUNIN
 * @Description:
 **/
public class Teacher {
    // 属性
    public String name;
    int age;
    int teachAge;
    String course;

    // 方法
    public String say() {
        return "姓名：" + name + "\n年龄：" + age + "\n教龄：" + teachAge + "\n课程：" + course;
    }
}
