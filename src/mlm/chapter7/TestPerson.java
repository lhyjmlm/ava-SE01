package mlm.chapter7;

public class TestPerson {
    public static void main(String[] args) {
     //用this判断两个对象是否属性相等
        PPerson p1 = new PPerson("mary", 20);
        PPerson p2 = new PPerson("smith", 30);
        System.out.println("比较P1，P2"+p1.compareTo(p2));

    }
}
class PPerson{
    String name;
    int age;
    public PPerson(String name,int age  ){
        this.name =name;
        this.age =age;
    }
    public boolean compareTo(PPerson p){
        return this.name.equals(p.name)&& this.age == p.age;
    }
}
