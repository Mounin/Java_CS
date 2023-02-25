package java230107;

import java.util.Scanner;

/**
 * @ClassName: Teach2
 * @Date: 2023/1/7 20:04
 * @Author: MOUNIN
 * @Description:
 * 从键盘读入学生成绩，找出最高分， 并输出学生成绩等级。
 * * 成绩>=最高分-10 等级为’A’
 * * 成绩>=最高分-20 等级为’B’
 * * 成绩>=最高分-30 等级为’C’
 * * 其余 等级为’D’
 * * 提示：先读入学生人数，根据人数创建int数组， 存放学生成绩。
 **/

public class Teach2 {

    public static void main(String[] args) {
        // 1. 从键盘读入学生数
        Scanner input = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int stuCount = input.nextInt();

        // 2.创建数组
        int[] score = new int[stuCount];
        System.out.println("请输入" + stuCount + "个成绩：");
        for (int i = 0; i < stuCount; i++) {
            score[i] = input.nextInt();
        }


    }
}
