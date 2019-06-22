package Alex.com.Student;

public class Student {
    String id;
    String name; //定義name欄位屬性為字串
    int englishscore;
    int mathscore;



    public Student(String name, int englishscore, int mathscore) {
        this.name=name;
        //把Student建構子方法內的區域變數name變成是我的name欄位屬性
        this.englishscore=englishscore;
        this.mathscore=mathscore;

    }

    public void print(){
        System.out.println(name+"\t"+ englishscore+ "\t"+mathscore
        +"\t" +(englishscore+mathscore)/2);
        // \t=TAB
    }

}
