package Alex.com;

public class Hello {

    public static void main(String[] args) {

        Person p=new Person("Alex",1.7,60.5);
        //p.Hello();
        int score=88;
        System.out.println(p.lastname());
        System.out.println(p.bmi());
        System.out.println(score<80 || score>85);
        //&&=A且B ||=A或B

    }

}
