import java.util.Scanner;

public class ClassCode {
    public static void main(String[] args) {
//        for (int i = 1; i < 100 ; i++) {
//            if (100%i==0){
//                System.out.println(i);
//            }
//        }


//        for (int i = 100; i < 500; i++) {
//            int temp = i;
//            temp+=i;
//            System.out.println(temp);
//        }


//        (2)	统计字符：从键盘上输入一个字符串，统计这个字符串当中包含几个大写字母，几个小写字母，几个数字，几个特殊符号；
//        Scanner scan =new Scanner(System.in);
//        String str1= scan.nextLine();
//        int big=0,small=0,num=0,special=0;
//        for (int i = 0; i < str1.length(); i++) {
//            char temp = str1.charAt(i);
//            if ('a'<=temp&&temp<='z'){
//                ++small;
//            }
//            else if ('A'<=temp&&temp<='Z'){
//                ++big;
//            }
//            else if ('0'<=temp&&temp<='9'){
//                ++num;
//            }else {
//                ++special;
//            }
//        }
//        System.out.println(big+"个大写字母，"+small+"个小写字母，"+num+"个数字，"+special+"个特殊符号");

//        (3)	鸡兔同笼35个头94只脚用 鸡有多少只 兔有多少只java程序解决;
//        for (int i = 1; i <= 35; i++) {
//            int j = 35 - i;
//            if (i + j == 35 && (2 * i) + (4 * j) == 94) {
//                System.out.println("鸡有：" + i + "兔有：" + j);
//            }
//
//        }


//        (4)密码验证：尝试将上述的用户名和密码验证分开进行，即如果用户名输入错误，
//        则不需要再提示输入密码，只有当用户名正确的情况下，我们才提示输入密码,并且机会只有3次;
//        Scanner scan = new Scanner(System.in);
//        int chance = 0;
//        while (chance < 3) {
//            System.out.println("请输入账号:");
//            String account = scan.nextLine();
//            if (!"admin".equals(account)) {
//                System.out.print("账号错误,");
//                chance++;
//                continue;
//            }
//            break;
//        }
//        while (chance < 3) {
//            System.out.println("请输入密码：");
//            String password = scan.nextLine();
//            if (!"123456".equals(password)) {
//                System.out.print("密码错误,");
//                chance++;
//                continue;
//            }
//            break;
//        }
//        if (chance==3) {
//            System.out.println("三次机会已用完，请重启");
//        } else {
//            System.out.println("登录成功!");
//        }

    }
}
