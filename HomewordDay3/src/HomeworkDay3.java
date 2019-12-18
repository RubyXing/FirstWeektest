import java.util.Scanner;

public class HomeworkDay3 {
    public static void main(String[] args){

//        System.out.println((int)(char)-1);

//        System.out.println((byte)128);

//        boolean flag= true;
//        Scanner scan=new Scanner(System.in);
//        System.out.println("欢迎登录");
//        do{
//            System.out.println("请输入账号：");
//            String account = scan.nextLine();
//            if (!"admin".equals(account)){
//                System.out.println("账号有误!");
//                continue;
//            }
//            System.out.println("请输入密码：");
//            String password=scan.nextLine();
//            if (!"123456".equals(password)){
//                System.out.println("密码有误!重新登录");
//                continue;
//            }
//            System.out.println("登录成功！");
//            flag=false;
//        }while (flag);

        System.out.println("请输入一个字符：");
        Scanner scan=new Scanner(System.in);
        char ch1=scan.next().charAt(0);
        if ('a'<ch1&&ch1<'z'){
            System.out.println("小写字母");
        }
        else if ('A'<ch1&&ch1<'Z'){
            System.out.println("大写字母");
        }
        else if ('0'<ch1&&ch1<'9'){
            System.out.println("数字");
        }else {
            System.out.println("其他字符");
        }
    }
}
