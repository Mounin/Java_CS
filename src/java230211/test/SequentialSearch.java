package java230211.test;

/**
 * @ClassName: SequentialSearch
 * @Date: 2023/2/6 20:39
 * @Author: MOUNIN
 * @Description:
 **/
public class SequentialSearch {

    public static void main(String[] args) {
        String[] str = new String[]{"JJ", "NN", "BB", "AA", "CC", "ZZ"};

        String dest = "BB";
//        dest = "DD";

        boolean isFlag = true;

        for (int i = 0; i < str.length; i++) {
            if(dest.equals(str[i])) {
                System.out.println("找到了，索引位置为：" + i);
                isFlag = false;
                break;
            }
        }

        if (isFlag) {
            System.out.println("很遗憾，没有找到。");
        }
    }
}
