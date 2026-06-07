/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: aa
 * Date: 2026-06-07
 * Time: 10:15
 */
public class Test {

//    输出闰年
//
//    输出 1000 - 2000 之间所有的闰年

    public static void main(String[] args) {
        for(int i=1000;i<=2000;i+=4){
            if(i%400==0){
                System.out.println(i);
            }
            if(i%100!=0&&i%4==0){
                System.out.println(i);
            }
        }
    }

//    计算分数的值
//
//    计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值    。
    public static void main3(String[] args) {
        int flag=1;
        double sum=0;
        for(;flag<=100;flag++){
            if(flag%2==0){
                sum-=1.0/flag;
            }
            else{
                sum+=1.0/flag;
            }
        }
        System.out.println("值是:"+sum);
    }

//    打印素数2
//
//    打印 1 - 100 之间所有的素数
    public static void main2(String[] args) {
        for(int i=1;i<=100;i++){
            int j = 2;
            for(;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    break;
                }

            }
            if(j>Math.sqrt(i)){
                System.out.println(i);
            }
        }

    }


//    数字9 出现的次数
//
//    编写程序数一下 1到 100 的所有整数中出现多少个数字9
    public static void main1(String[] args) {
        int ret = 0;

        for(int i=1;i<=100;i++){
            int tmp = i;
            while(tmp!=0){
                if(tmp%10==9){
                    ret++;
                }
                tmp /= 10;
            }
        }
        System.out.println(ret);
    }

}
