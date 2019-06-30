package Alex.com.Student;

public class GraduateStudent extends Student {
    int thesis;
    static  int pass=70;

    public GraduateStudent(String name, int english, int math, int thesis) {


        super(name, english, math);

        // super()方法用於呼叫，所繼承父類別身上之建構子，
        // 一般來說是呼叫 public GraduateStudent() { super(); }此所繼承父類別之不含任何傳入參數的建構子

        this.thesis = thesis;
    }


        @Override
    public void print() {

            int average=getAverage();
            System.out.print(name+"\t"+ englishscore+ "\t"+mathscore
                    +"\t"+ thesis +"\t" + getAverage()
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

            System.out.println("\t"+ grading);
            }

    }


}
