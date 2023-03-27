package mlm.chapter7;

public class MiGong {
    //迷宫问题
    public static void main(String[] args) {
        int[][] map =new int [8][7];
        for(int i =0; i< 7;i++){
            map[0][i]= 1;
            map[7][i]=1;
        }

        for(int i=0 ; i<8; i++){
            map[i][0]   =1;
            map[i][6]   =1;

        }
        map[3][1]=1;
        map[3][2]=1;
        //打印当前地图
        System.out.println("====当前地图迷宫===");
        for (int i=0; i<map.length;i++      ){
            for(int j=0; j<map[i].length;j++){
                System.out.print(map[i][j]+" ");//输出一行
            }
            System.out.println();//换行
        }
        //确定起始位置（1,1),调用findway()将改变地图，
        // 通过变化对应二维数组元素的值，数字寻找路径
        //所以在打印出的地图会有路径显示
        MiGong t1 = new MiGong();
        t1.findWay(map,1,1  );

        System.out.println("\n===找路地图路线");
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map[i].length;j++){
                System.out.print(map[i][j]+ " ");
            }
            System.out.println();
        }

    }

    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                map[i][j] = 2;
                if (findWay(map, i + 1, j)) {
                    return true;
                } else if (findWay(map, i, j + 1)) {
                    return true;
                } else if (findWay(map, i - 1, j)) {
                    return true;
                } else if (findWay(map, i, j - 1)) {
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }

            } else {
                return false;
            }
        }
    }
}
