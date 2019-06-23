package Alex.com.Student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        //UserInput();
        Student stu=new Student("Alex",90,100);
        stu.print();
        System.out.println("High score:"+ stu.heighestscore());


    }

    private static void UserInput() {
        System.out.println("Please enter the student name:");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next(); //儲存輸入name資料
        System.out.println("Please enter the englishscore:");
        int englishscore=scanner.nextInt();
        System.out.println("Please enter the mathscore:");
        int mathscore=scanner.nextInt();
        Student stu=new Student(name,englishscore,mathscore);
        stu.print();
        System.out.println(stu.heighestscore());
    }
}
