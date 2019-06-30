package Alex.com.Student;

public class Student {
    String id;
    String name; //定義name欄位屬性為字串
    int englishscore;
    int mathscore;
    static int pass;



    public Student(String name, int englishscore, int mathscore) {
        this.name=name;
        //把Student建構子方法內的區域變數name變成是我的name欄位屬性
        this.englishscore=englishscore;
        this.mathscore=mathscore;

    }


    public int heighestscore(){
        int max=(englishscore>mathscore)? englishscore:mathscore;

       /*if (englishscore>mathscore){
            max=englishscore;
        }else {
            max=mathscore;
        }*/

        return max;

    }


    public void print(){
        int average=getAverage();
        System.out.print(name+"\t"+ englishscore+ "\t"+mathscore
        +"\t" + getAverage()
        +"\t" + ((getAverage()>=pass)? "PASS":"FAILED")
        );
        // \t=TAB

        char grading='F';

        switch (average/10){
            case 10:
            case 9:
                grading='A';
                break;

            case 8:
                grading='B';
                break;

            case 7:
                grading='C';
                break;

            case 6:
                grading='D';
                break;

            default:
                    grading='F';
        }
        System.out.println("\t"+ grading);




       /* if (getAverage()>=90 && getAverage()<=100){
            grading='A';

        }else if (getAverage()>=80 && getAverage()<=89){
            grading='B';

        } else if (getAverage()>=70 && getAverage()<=79){
            grading='C';

        } else if (getAverage()>=60 && getAverage()<=69){
            grading='D';
        }
        System.out.println("\t"+ grading);
*/

        /*if (getAverage()>=60){
            System.out.println("\tPASS");

        }else {
            System.out.println("\tFAILED");


        }*/


    }

    public int getAverage(){
        return (englishscore+mathscore)/2;

    }

}
