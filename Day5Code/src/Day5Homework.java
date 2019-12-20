import java.util.Scanner;

public class Day5Homework {
    public static void main(String[] args){
        String[][] account=new String[][]{{"张三","123456"},{"ruby","654321"},{"李四","321654"}};
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入账号：");
        String acc=scan.nextLine();
        System.out.println("请输入密码：");
        String pwd=scan.nextLine();
        boolean flag=false;
        for (String[] i : account) {
            if (i[0].equals(acc)&&i[1].equals(pwd)){
                flag=true;
            }
        }
        System.out.println(flag?"登录成功":"登录失败");
    }
}
