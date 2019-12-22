
import java.util.Scanner;

public class Day6Homework {
    public static void main(String[] args) {
        String[][] users = new String[10][2];
        users[0] = new String[]{"ruby", "123456"};
        users[1] = new String[]{"xing", "123456"};
        users[2] = new String[]{"张三", "123456"};
        Day6Homework test = new Day6Homework();
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择登陆（1）或注册（2）");
        switch (sc.nextLine()) {
            case "1":
                System.out.println(test.Login(users) ? "登陆成功！" : "登陆失败！");
                break;
            case "2":
                System.out.println(test.Register(users));
                break;
            default:
                System.out.println("无效的选择，再见！");
                break;
        }
    }

    public boolean Login(String[][] users) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String acc = sc.nextLine();
        System.out.println("请输入密码：");
        String pwd = sc.nextLine();
        for (String[] user : users) {
            if (acc.equals(user[0]) && pwd.equals(user[1])) {
                flag = true;
            }
        }
        return flag;

    }

    public String Register(String[][] users) {
        boolean flag = false;
        int addnum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String acc = sc.nextLine();
        System.out.println("请输入密码：");
        String pwd = sc.nextLine();
        for (String[] user : users) {
            if (acc.equals(user[0]) && pwd.equals(user[1])) {
                flag = true;
                addnum++;
            }
        }
        if (!flag) {
            users[addnum] = new String[]{acc, pwd};
        }
        return flag ? "账号已存在!请直接登陆，注册失败" : "注册成功!";
    }
}
