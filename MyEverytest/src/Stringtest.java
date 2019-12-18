import javax.sound.midi.Soundbank;

public class Stringtest {
    public static void main(String[] args) {
        String str1 = "12.1";
        double dou1 = 14.2;
        str1 = Double.toString(dou1);
        System.out.println(5 % 5);

        int mathscore = (int) (Math.random() * 100);
        if (mathscore < 60) {
            System.out.println("you are failed,you got:" + mathscore);
        } else {
            System.out.println("you are pass,you got:" + mathscore);
        }

        char cha1 = '&';
        if (('a' <= cha1 && cha1 <= 'z') || ('A' <= cha1 && cha1 <= 'Z')) {
            System.out.println("输入的符号是字母");
        } else if ('0' <= cha1 && cha1 <= '9') {
            System.out.println("输入的符号是数字");
        } else {
            System.out.println("输入的符号是字符");
        }


        if (mathscore < 60) {
            System.out.println("不及格:" + mathscore);
        } else if (60 < mathscore && mathscore < 80) {
            System.out.println("良:" + mathscore);
        } else if (80 < mathscore) {
            System.out.println("优:" + mathscore);
        }

        if (mathscore % 3 == 0) {
            if (mathscore % 5 == 0) {
                if (mathscore % 7 == 0) {
                    System.out.println("能同时被357整除");
                }
            }
        }

        int year2=2018;

        if(year2 % 4 == 0 && year2 % 100 != 0 || year2 % 400 == 0){

            System.out.println("是闰年");

        }else{

            System.out.println("不是闰年");

        }


        int a = 10;
        int b = 30;
        int c = 20;
        int max = (a > b) ? a : b;
        max = (max > c) ? max : c;



    }
}
