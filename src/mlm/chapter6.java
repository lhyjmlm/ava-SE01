package mlm;

public class chapter6 {


    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[][] yanghui = new int[10][];
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];
            for (int j = 0; j < yanghui[i].length; j++) {
                if (j == 0 || j == yanghui[i].length - 1) {
                    yanghui[i][j] = 1;
                } else {
                    yanghui[i][j] = yanghui[i - 1][j] + yanghui[i - 1][j - 1];
                }
            }
        }
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }
     /*   //杨辉三角，列数不等二维数组
        int[][] yanghui = new int[10][];
        for(int i = 0; i < yanghui.length; i++){
            yanghui[i] = new int[i+1];
            for(int j = 0; j < yanghui[i].length; j++){
                if(j == 0 || j == yanghui[i].length - 1){
                    yanghui[i][j] = 1;
                }else{
                    yanghui[i][j] = yanghui[i-1][j] + yanghui[i-1][j-1];
                }
            }
        }
        for(int i = 0; i < yanghui.length; i++){
            for(int j = 0; j < yanghui[i].length; j++){
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }*/

       /* //二维数组初始化
        int arr[][];
        arr = new int[2][3];
        arr[1][1] = 8;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }*/

       /* //查找
        String[] names = {"白眉鹰王", "金毛", "紫衫", "清漪"};
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入名字");
        String findName = myScanner.next();
        int index = -1;
        for(int i = 0; i < names.length; i++){
            if(findName.equals(names[i])){
                System.out.println("恭喜找到" + findName);
                System.out.println("下标=" + i);
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("sorry, 没有找到" + findName);
        }*/

        //冒泡排序
        /* //冒泡
        int[] arr = {24, 69, 80, 57, 13};
        int temp = 0;
        for(int i = 0; i < arr.length - 1; i++){
            for( int j = 0; j < arr.length - 1 -i; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("\n==第" + (i + 1) + "轮==");
            for (int j = 0; j < arr.length; j++){
                System.out.print(arr[j] + "\t");
            }
        }*/

      /*  //数组扩容
        Scanner myScanner = new Scanner(System.in);
        int[] arr = {1, 2, 3};
        do{
            int[] arrNew =new int[arr.length + 1];
            for(int i = 0; i < arr.length; i++){
                arrNew[i] = arr[i];
            }
            System.out.println("请输入你要添加的元素");
            int addNum = myScanner.nextInt();
            arrNew[arrNew.length - 1] = addNum;
            arr = arrNew;
            System.out.println("===arr扩容后元素情况==");
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i] + "\t");
            }
            System.out.println("是否继续添加y/n");
            char key = myScanner.next().charAt(0);
            if( key == 'n'){
                break;
            }
        }while (true);
        System.out.println("你退出了添加了...");
*/
     /*   //数组扩容
        int[] arr = {1, 2, 3};
        int[] arrNew = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++){
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = 4;
        arr = arrNew;
        System.out.println(" ==arr扩容后元素情况==");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }*/
      /*  //数组反转
        int[] arr = {11, 22, 33, 44, 55, 66};
        int[] arr2 = new int[arr.length];
        for(int i = arr.length - 1, j = 0; i >= 0; i--, j++){
            arr2[j] = arr[i];
        }
        arr = arr2;
        System.out.println(" ==翻转后arr的元素情况==");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
*/
      /*  //数组反转
        int[] arr = {11, 22, 33, 44, 55, 66};
        int temp = 0;
        int len = arr.length;
        System.out.println("==翻转前的数组==");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < len / 2; i++){//翻转
            temp = arr[len - 1 - i];
            arr[len - 1 - i] = arr[i];
            arr[i] = temp;
        }
        System.out.println("==翻转后的数组==");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
*/
/*
    //数组赋值数组
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        arr2[0] = 10;
        System.out.println("==arr1的元素==");
        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
        System.out.println("===arr2的元素==");
        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }*/
       /* //求数组最大值与对应下标
        int[] arr = {4, -1, 9, 10, 23};
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++){
            if(max == arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("最大值max=" + max + " maxIndex=" + maxIndex);
*/


       /* //输出A-Z
        char[] chars = new char[26];
        for(int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('A' + i);
        }
        System.out.println("==chars数组==");
        for(int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }*/


        /*//循环输入5个成绩到double数组
        double scores[] = new double[5];
        Scanner myScanner = new Scanner(System.in);
        for(int i = 0; i < scores.length; i++){
            System.out.println("请输入第" + (i + 1) + "个元素的值");
            scores[i] = myScanner.nextDouble();
        }
        System.out.println("==数组的元素/值的情况如下：==");
        for(int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "个元素的值=" + scores[i]);
        }*/


        /*计算平均体重
        double[] hens = {3, 5, 1, 3.4, 2, 50, 7.8, 88.8};
        System.out.println("====使用数组解决==");
        double totalWeight = 0;
        for(int i = 0; i < hens.length; i++) {
            totalWeight += hens[i];
        }
        System.out.println("总体重=" + totalWeight
            + "平均体重=" + (totalWeight / hens.length));*/


    }
}
