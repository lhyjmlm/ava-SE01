package mlm;

import java.util.Scanner;

public class chapter5 {
    public static void main(String[] args) {



    }
}
/*  Scanner myscanner =new Scanner(System.in);
    String name = " ";
    String passwd = "";
    int chance = 3;
    for( int i = 1;i <= 3;i++){
        System.out.println("请输入名字");
        name = myscanner.next();

        System.out.println("请输入密码");
        passwd = myscanner.next();
        if ("ikun坤".equals(name)&& "666".equals(passwd)){
            System.out.println("登陆成功");
            break;
        }
        chance--;
        System.out.println("还有"+ chance + "登陆次数");
    }*/


/*      double money = 100000;
       int count = 0;
       while(true){
           if(money > 50000){
               money *= 0.95;
               count++;
           }else if(money >= 10000){
               money -= 1000;
               count++;
           }else {
               break;
           }
       }


        System.out.println(money +  "\n" + "可以过"  + count + "个路口");
*/



/* int n = 153;
        int n1 = n / 100;
        int n2 = n % 100 / 10;
        int n3 = n % 10;
        if( n1 * n1 * n1 + n2 * n2 *n2 + n3 * n3 * n3 == n){
            System.out.println(n + "是水仙花数");
        }else{
            System.out.println(n + "不是水仙花数");

        }*/


 /*   for (char c1 = 'a'; c1 <= 'z'; c1++) {
            System.out.print(c1 + " ");
        }
        for (char c1 = 'Z'; c1 >= 'A'; c1--) {
            System.out.print(c1 + ' ');
        }*/


/*
    金字塔
        int i =1;//层数
        int j =1;//每层*个数
//        int k =1;//每层空格数
//        Scanner input = new Scanner(System.in);
        System.out.println("请输入打印总层数total:");


        int total = input.nextInt();//总层数
        System.out.println("打印结果:");
        for( ; i <= total; i++){
            for(k = 1; k <= total-i; k++){//2*total-1=当前层‘*’+”空格“的总数
                System.out.print(' ');
            }
            for(j = 1; j <= 2*i-1; j++){//2*i-1为当前层*数
                if( j ==1 || j == 2*i - 1 || i == total){
                    System.out.print('*');
                }
                else {
                    System.out.print(' ');
                }

            }

            System.out.println();

        }

*/



  /*  double sum = 0;
    for (int i = 1; i<= 100; i++){
        if( i % 2 != 0){
            sum += 1.0/1;

        }else {
            sum -= 1.0/i;
        }
    }
        System.out.println("sum" + sum);

    }
}*/
