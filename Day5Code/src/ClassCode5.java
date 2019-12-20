import java.util.Arrays;

public class ClassCode5 {
    public static void main(String [] args){
//        int[] nums={8,4,2,1,23,344,12};
//        System.out.print(Arrays.toString(nums));

//练习:
//1、定义两个int型数组firstBuf和secondBuf ,将其连接为一个大数组buf.
//2、对buf数组进行升序排序，要求不使用自带的sort方法。
        int[] firstBuf, secondBuf;
        firstBuf = new int[]{1, 4, 7, 9};
        secondBuf = new int[]{2, 9, 6, 3};
        int[] buf = new int[firstBuf.length + secondBuf.length];
        for (int i = 0; i < firstBuf.length; i++) {
            buf[i] = firstBuf[i];
        }
        for (int i = firstBuf.length; i < buf.length; i++) {
            buf[i] = secondBuf[i - firstBuf.length];
        }
        for (int j = buf.length; j >= 0; j--) {
            for (int i = 0; i < j - 1; i++) {
                if (buf[i] > buf[i + 1]) {
                    buf[i + 1] = buf[i] + buf[i + 1];
                    buf[i] = buf[i + 1] - buf[i];
                    buf[i + 1] = buf[i + 1] - buf[i];
                }
            }
        }
        System.out.println(Arrays.toString(buf));
    }
}
