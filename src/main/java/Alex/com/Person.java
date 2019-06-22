package Alex.com;

public class Person {
    String name;
    double height;
    double weight;

    public Person(double height,double weight){
        this.height=height;
        this.weight=weight;

    }

    public Person(String name,double height,double weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }

    public String lastname(){
        String lastname=name;
        return lastname;

    }

    public double bmi() {
        double bmi = weight / (height * height);
        return bmi;
    }



    public void Hello(){
        System.out.println("Hello World");
    }


}
