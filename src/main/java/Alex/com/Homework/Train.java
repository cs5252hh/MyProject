package Alex.com.Homework;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        int number= 0;
        while (true) {
            System.out.println("親愛的乘客您好");
            Scanner scanner = new Scanner(System.in);
            System.out.println("請輸入姓名：");
            String name = scanner.next();
            System.out.println("請輸入張數：");
            number = scanner.nextInt();
            if (number == -1) break;
            System.out.println("請輸入來回票：");
            int roundtrip = scanner.nextInt();
            TrainTicket train1 = new TrainTicket(name, number, roundtrip);
            System.out.println("親愛的乘客：" + name);
            System.out.println("購票張數為：" + number);
            System.out.println("來回票張數為：" + roundtrip);
            System.out.println("總金額為：" + train1.getamount());
        }


    }


}

