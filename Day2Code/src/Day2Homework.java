import java.util.Scanner;

public class Day2Homework {
    public static void main(String[] args) {

//        （2）水仙花数：计算三位整数（100～999）的水仙花数。水仙花数是指每一位的立方相加等于该数自己.
//        比如153=1^3+5^3+3^3.（提示：从100循环到999是一个三位数，将其百数，十位数和个位数拆分出来即可，
//        可以利用%取余和/除法进行相关运算。也可以利用三重循环将数字0~9拼出来一个三位数)。

//        for (int i = 100; i < 999; i++) {
//            int first, second, third;
//            first = i / 100;
//            second = (i / 10) % 10;
//            third = i % 10;
//            boolean flag = i==(Math.pow(first,3)+Math.pow(second,3)+Math.pow(third,3));
//            if (flag){
//                System.out.println(i+"是水仙花数");
//            }
//        }

//        （3）次方计算：计算X的Y次方，X（底数)和Y（指数）的值由用户输入，只考虑指数为整数的情况，注意各种可能的情况要考虑周到。
//        （提示：不要使用Java内置的方法Math.pow（xy)进行

//        Scanner scan = new Scanner(System.in);
//        while (true) {
//            int base, index, temp = 1;
//            System.out.println("请输入底数：");
//            if (scan.hasNextInt()) {
//                base = scan.nextInt();
//            } else {
//                System.out.println("不是整数！");
//                //hasNextInt()有点像缓存的机制，当调用hasNextInt()时，那么它的空间中会存入一个值，
//                // 再次调用不会覆盖或增加，而是保持原来的值。当调用next()或nextInt()会将空间的值给next或nextInt，
//                // 同时清空它空间中的值，从而可以再次接收新的值。
//                String flash = scan.next();           //不加这句会死循环
//                continue;
//            }
//            System.out.println("请输入指数：");
//            if (scan.hasNextInt()) {
//                index = scan.nextInt();
//                if (base == 0 && index == 0) {
//                    System.out.println("底数为0时指数不能为0");
//                    continue;
//                } else if (index == 0) {
//                    System.out.println("计算结果：1");
//                } else if (index > 0) {
//                    for (int i = 0; i < index; i++) {
//                        temp *= base;
//                    }
//                    System.out.println("计算结果：" + temp);
//                } else {
//                    for (int i = 0; i < index * -1; i++) {
//                        temp *= base;
//                    }
//                    System.out.println("计算结果：1/" + temp);
//                }
//                break;
//            }
//        }

//         (4）抓球问题：用1元纸币兑换1分。2分和5分的硬币，要求兑换总数为50枚，问可以有多少界组合，每种组合对应1分，2分，5分分别是多少?

//        for (int i = 0; i <= 50; i++) {
//            for (int j = 0; j < 50 - i; j++) {
//                if ((i + 2 * j + (5 * (50 - j - i))) == 100) {
//                    System.out.println("1分：" + i + "个,2分：" + j + "个，5分:" + (50 - j - i) + "个");
//                }
//            }
//        }

//        （5）九九乘法表：尝试用for循环完成九九乘法表输出。(提示：可以使用双重循环，内层循环的次受外层循环变量影响)。
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i + "x" + j + "=" + (i * j) + "  ");
//            }
//            System.out.println();
//        }

//        （6）价格猜猜猜：随机产生一个200以内的价格，并且让用户猜测该价格，如果比实际价格高，则出“高了”，
//        否则输出“低了”，直到猜对为止，输出“对了”，程序结束。(使用Math.random()生成一个0~1之间的随机小数)。

//        int price = (int) (200 * Math.random());
//        Scanner scan = new Scanner(System.in);
//        System.out.println("随机数已生成，请输入猜测：");
//        while (true) {
//            if (scan.hasNextInt()) {
//                int num = scan.nextInt();
//                if (num == price) {
//                    System.out.println("猜对了");
//                    break;
//                }
//                String message = num < price ? "低了" : "高了";
//                System.out.println(message);
//            }
//        }

//        （7）字符串判断：从键程输入一个字符串，判断该字符串是否可以被转换为一个有效的数字。

        Scanner scan = new Scanner(System.in);
        boolean flag = false;
//      先判断是否全是数字组成
        if (scan.hasNextDouble()) {
            String str1 = scan.nextLine();
//          初始化前三位确认正负小数，即0开头的两种情况
            char num[] = {str1.charAt(0), str1.charAt(1), str1.charAt(2)};
//          循环确认至少有一位不为0的数
            for (int i = 0; i < str1.length(); i++) {
                char temp = str1.charAt(i);
                if ('0' < temp && temp <= '9') {
                    flag = true;
                }
            }
            if (flag) {
//              正数小数0. 开头
                if ((num[0] == 0 && num[2] == '.')) {
                    System.out.println("有效正数:" + str1);
//              正小数.   开头
                } else if (num[0] == '.') {
                    System.out.println("有效正数：0" + str1);
//              负数小数-0.  开头
                } else if (num[0] == '-' && num[1] == '0' && num[2] == '.') {
                    System.out.println("有效负数：" + str1);
//              负小数-.    开头
                } else if (num[0] == '-' && num[1] == '.') {
                    str1=str1.replace('-','0');
                    System.out.println("有效负数：-"+str1);
//              非零开头正数
                } else if ('0' != num[0]) {
                    System.out.println("有效正数：" + str1);
//              非零开头负数
                } else if (num[0] == '-' && num[1] != '0') {
                    System.out.println("有效负数：" + str1);
                } else {
                    System.out.println("格式不标准,不能转换成数字");
                }
            } else {
                System.out.println("缺少有效数字位!");
            }
        } else {
            System.out.println("不能转换成数字!");
        }

    }
}
