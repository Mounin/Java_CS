package java230218.test;

/**
 * @ClassName: Test
 * @Date: 2023/2/16 16:09
 * @Author: MOUNIN
 * @Description:
 **/
public class Test {
    public static void main(String[] args) {
        // 创建Student类实例stu
        Student stu = new Student();
        // 给属性赋值
        stu.name = "Tom";
        stu.age = 22;
        stu.major = "计算机";
        stu.interests = "足球";
        // 调用类的方法
        String sayOfStudent = stu.say();
        System.out.println(sayOfStudent);
        // 调用static方法
        System.out.println(Student.isStatic);

        // 创建Teacher类实例teacher
    }
}
