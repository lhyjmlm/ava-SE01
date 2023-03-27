package mlm;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");



    }
}
        //求九九乘法表
     /*   int i= 1;
        int j= 1;
        for(;j<=9;j++){


           for(i=1;i<=j;i++){
                System.out.print(i+"*"+j + "=" + i * j + " ");
            }
            System.out.println();
        }
*/



        /*求班级平均成绩
        Scanner input = new Scanner(System.in);
        double count = 0;
        double sum = 0;

        int i = 1;
        double average = 0;
        for (; i <= 3; i++) {
            System.out.println("请分别输入"+ i + "班5个同学成绩:");
            count = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("输入同学"+ j + "的成绩:");

                double score = input.nextDouble();
                sum = sum + score;
                if (score >= 60) {
                    count++;
                }
            }
            sum = 0;
            average = sum / 5;

            System.out.println(i + "平均成绩" + average);
            System.out.println(i + "班及格人数" + count);
            average = 0;
        }
    }
}*/