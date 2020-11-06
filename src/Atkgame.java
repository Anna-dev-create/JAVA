import java.util.Scanner;

class Atkgame {
    private String name1;
    private int health1;
    private int  atk1;
    private int defence1;
    private String name2;
    private int health2;
    private int atk2;

        public String getName1 (){
        return name1;
        }
        public void setName1 (String n1){
         name1=n1;
        }
        public int getHealth1 (){
        return health1 ;
        }
        public void setHealth1 (int h1){
        health1 =h1;
        }
        public int getAtk1 (){
        return atk1;
        }
        public void setAtk1 (int a1){
        atk1=a1;
        }
        public int getDefence1 (){
        return defence1 ;
        }
        public void setDefence1 (int d1){
        defence1 =d1;
        }
        public String getName2 (){
        return name2;
        }
        public void setName2 (String n2){
        name2=n2;
        }
        public int getHealth2() {
        return health2;
        }
        public void setHealth2 (int h2){
        health2 =h2;
        }
        public int getAtk2 (){
        return atk2;
        }
        public void setAtk2 (int a2){
        atk2=a2;
        }
        public void attk(){
            System.out.printf("攻击!!!");
        }

 }
 class Atk {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.println("请输入主角姓名");
         String str = sc.next();
         System.out.println("主角名字：" + str);
         System.out.println("请输入主角生命值1-999:");
         int n = sc.nextInt();
         System.out.println("初始生命值：" + n);
         System.out.println("请输入主角攻击力1-999：");
         int m = sc.nextInt();
         System.out.println("主角攻击力：" + m);
         System.out.println("请输入防御力1-999：");
         int p = sc.nextInt();
         System.out.println("主角防御力：" + p);
         System.out.println("请输入怪兽姓名：");
         String sr = sc.next();
         System.out.println("怪兽姓名：." + sr);
         System.out.println("请输入怪兽初始生命值1-999：");
         int a = sc.nextInt();
         System.out.println("怪兽初始生命值：" + a);
         System.out.println("请输入怪兽攻击力：");
         int s = sc.nextInt();
         System.out.println("怪兽攻击力：" + s);
         System.out.println("游戏开始");
         Atkgame atkgame = new Atkgame();
         atkgame.attk();
         atkgame.setName1(str);
         System.out.println("第一局开始了~~~~~");
         System.out.println("由玩家攻击怪兽");
         System.out.println("怪兽剩余血量为：" + (a - m));
         System.out.println("第二局我们转变一下方式，由怪兽攻击玩家吧~~");
         System.out.println("玩家剩余血量为：" + (n - s));
         System.out.println("现在你有一个机会可以进行血量恢复，但不知道将血量加到自己还是怪物身上，现在你可以在1和2中" +
                 "任意选择一个数，请开始你的选择吧~~");
         int t = sc.nextInt();
         System.out.println("您选择了" + t + "这个数字，您确定不再更改了么？咳咳，其实您也没办法更改了，那我们进行下一步吧");
         if (t == 1) {
             System.out.println("很抱歉，怪兽即将恢复生命值");
         } else {
             System.out.println("恭喜你，玩家即将恢复血量");
         }
         int f = 100;
         if (t == 1) {
             System.out.println("怪兽当前生命值为：" + (a - m + f));
             if ((a - m + f) > (n - s)) {
                 System.out.println("这局怪兽获胜了，下次继续加油吧");
             } else {
                 System.out.println("恭喜你，取得了这次胜利");
             }

         } else {
             System.out.println("玩家当前生命值为：" + (n - s + f));
             if ((n - s + f) > (a - m)) {
                 System.out.println("恭喜你，取得了这次胜利");
             } else {
                 System.out.println("这局怪兽获胜了，下次继续加油吧");
             }
         }
         System.out.println("这局游戏结束，感谢您的参与啊~~");

     }
 }