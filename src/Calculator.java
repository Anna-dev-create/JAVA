import java.awt.*;
import java.util.Scanner;

import java.awt.*;
import java.util.Scanner;

class Calculator {
    private String name;
    public String getName() {
        return name;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("欢迎使用计算器，很高兴为您提供这次服务");
            System.out.println("您现在有两个选择，1.整数运算2.小数运算");
            int str = sc.nextInt();
            System.out.println("您的选择是" + str);
            int i = str;
            System.out.println("您现在应输入的格式为：数值+符号+数值");
            try{throw new MyExcption("格式不正确");
                switch (i) {
                    case 1:
                        System.out.println("您选择了整数运算");
                        System.out.println("请您输入第一个数据");
                        int m = sc.nextInt();
                        System.out.println("您输入的第一个数据为" + m);
                        System.out.println("请您输入第二个数据");
                        int n = sc.nextInt();
                        System.out.println("您输入的第二个数据为" + n);
                        System.out.println("请选择您要进行的运算：1.加法2.减法3.乘法4.除法且第一个数据为被除数" +
                                "5.除法且第二个数据为被除数");
                        int q = sc.nextInt();
                        System.out.println("您的选择是" + q);
                        String a = sc.next();
                        System.out.println("您输入的计算式为：" + a);
                        int w = q;
                        switch (w) {
                            case 1:
                                System.out.println("您选择进行加法运算");
                                System.out.println("运算结果为" + (m + n));
                            case 2:
                                System.out.println("您选择进行减法运算");
                                System.out.println("运算结果为" + (m - n));
                            case 3:
                                System.out.println("您选择进行乘法运算");
                                System.out.println("运算结果为" + (m * n));
                            case 4:
                                System.out.println("您选择进行除法运算且m为被除数");
                                System.out.println("运算结果为" + (m / n));
                            case 5:
                                System.out.println("您选择进行除法运算且n是被除数");
                                System.out.println("运算结果为" + (n / m));
                            default:
                                System.out.println("******计算结束******");
                        }
                    case 2:
                        System.out.println("您选择了小数运算");
                        System.out.println("请您输入第一个数据");
                        float e = sc.nextFloat();
                        System.out.println("您输入的第一个数据为" + e);
                        System.out.println("请您输入第二个数据");
                        float r = sc.nextFloat();
                        System.out.println("您输入的第二个数据为" + r);
                        System.out.println("请选择您要进行的运算：1.加法2.减法3.乘法4.除法且第一个数据为被除数" +
                                "5.除法且第二个数据为被除数");
                        int t = sc.nextInt();
                        System.out.println("您的选择是" + t);
                        int y = t;
                        switch (y) {
                            case 1:
                                System.out.println("您选择进行加法运算");
                                System.out.println("运算结果为" + (e + r));
                            case 2:
                                System.out.println("您选择进行减法运算");
                                System.out.println("运算结果为" + (e - r));
                            case 3:
                                System.out.println("您选择进行乘法");
                                System.out.println("运算结果为" + (e * r));
                            case 4:
                                System.out.println("您选择进行除法运算且第一个数据为被除数");
                                System.out.println("运算结果为" + (e / r));
                            case 5:
                                System.out.println("您选择进行除法运算且第二个数据为被除数");
                                System.out.println("运算结果为" + (r / e));
                            default:
                                System.out.println("******计算结束******");
                        }
                }
            }catch(Exception C){
                System.out.println(C);
            }
        } catch (Exception k){
            System.out.println("出现异常了"+k);
        }
        System.out.println("计算结束，感谢使用~~~~~~~");
    }
}
