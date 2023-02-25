package java230107;

import java.util.Scanner;

/**
 * @ClassName: Practice1
 * @Date: 2023/1/2 22:08
 * @Author: MOUNIN
 * @Description:
 **/
public class Practice1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int stuNum = scanner.nextInt();

        double[] scores = new double[stuNum];
        System.out.println("请输入" + stuNum + "个成绩：");
        for(int i=0; i<scores.length; i++) {
            scores[i] = scanner.nextDouble();
        }

        double maxScore = 0.0;
        for(double score: scores){
            if(score > maxScore) {
                maxScore = score;
            }
        }

        String grade;
        System.out.println("最高分是：" + maxScore);
        for(int i=0; i<scores.length; i++) {
            if(scores[i] >= maxScore - 10) {
                grade = "A";
                System.out.println("Student " + i + " score is " + scores[i] + " grade is " + grade);
            } else if (scores[i] >= maxScore - 20) {
                grade = "B";
                System.out.println("Student " + i + " score is " + scores[i] + " grade is " + grade);
            } else if (scores[i] >= maxScore - 30) {
                grade = "C";
                System.out.println("Student " + i + " score is " + scores[i] + " grade is " + grade);
            } else {
                grade = "D";
                System.out.println("Student " + i + " score is " + scores[i] + " grade is " + grade);
            }
        }
    }
}
