package Alex.com.Guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random= new Random();
        int secret = random.nextInt(10)+1;
        System.out.println(secret);
        Scanner scanner= new Scanner(System.in);
        int number=0;
        while (number != secret) {
            System.out.println("Please enter a number");
            number = scanner.nextInt();

            if (number < secret){
                System.out.println("higer");

            } else if ( number > secret) {
                System.out.println("lower");

            } else {
                System.out.print("Great! the number is: " +number);

            }

        }

       /* int i=0;
        do {
            System.out.println(i);
            i++;

        }while (i<3);*/

    /*do~while 迴圈一定會執行一次 System.out.println(i)
    先執行 System.out.println(i)印出0 接著執行 i++
    i++也就是 i=i+1 因為do已經執行了印出0 接著把0放進來加1
    在印出 1... 直到 i<3才會跳出do~while迴圈*/


    }
}
