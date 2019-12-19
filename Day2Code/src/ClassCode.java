import java.util.Scanner;

public class ClassCode {
    public static void main(String[] args){
//        for (int i = 1; i < 100 ; i++) {
////            if (100%i==0){
////                System.out.println(i);
////            }
////        }
        Scanner scan= new Scanner(System.in);
        do{
            System.out.println("请输入账号:");
            String account=scan.nextLine();
            if (!"admin".equals(account)){
                System.out.println("账号错误");
                continue;
            }
            System.out.println("请输入密码：");
            String password=scan.nextLine();
            while (!"123456".equals(password)){
                System.out.println("密码错误，请重输：");
                password=scan.nextLine();
            }
            System.out.println("登录成功!");
            break;
        }while (true);

        for (int i = 100; i < 500; i++) {
            int temp = i;
            temp+=i;
            System.out.println(temp);
        }
    }
}
