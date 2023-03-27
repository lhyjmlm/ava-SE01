package mlm.chapter7;

public class MethodExercise02 {
//对象传递，复制p->p2
    public static void main(String[] args) {
        Person p = new Person();
        p.name ="milan";
        p.age =100;

        MyTools tools = new MyTools();
        Person p2 =new Person() ;
        p2 = tools.copyPerson(p,p2);
        System.out.println("p的属性="+ p.name+p.age);
        System.out.println("p2的属性="+ p2.name+p2.age);

    }
}
class Person{
    String name;
    int age;
}
class MyTools{
    public Person copyPerson(Person p, Person p2){

        p2.name = p.name;
        p2.age = p.age;
        return p2;

    }

}