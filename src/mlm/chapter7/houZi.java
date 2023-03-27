package mlm.chapter7;

public class houZi {
    public static void main(String[] args) {
        T1 t1 = new T1();
        int day=5;
        int peachNum  = t1.peach(day);
        if(peachNum != -1){
            System.out.println("第"+day+"天有"+peachNum+"个");
        }
    }
}
class T1{
    public  int peach(int day){
        if(day == 10 ){
            return  1;
        }else if(day>= 1 && day<=9){
            //day=n时， 有（（n+1） +1）*2=第n天桃子数
            return (peach(day+1)+1)*2;
        }else{
            System.out.println("day在1-10");
            return -1;
        }

    }
}
