package Alex.com.Guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        /*int sum=0;
        for (int i=5 ; i>=1; i--){
            sum=sum+i;

        }
        System.out.println(sum);*/

        /* for迴圈用於累加計數器使用
        for(起始值 ; 判斷式條件是否為True ; 累加 )
         {
                程式執行區段
         }
         for迴圈執行方式：
            1: 帶入起始值
            2: 判斷式條件是否為True
            3: 執行程式區段
            4: 執行累加
            5: 執行累加後，判斷是否為真*/

        Scanner scanner= new Scanner(System.in);
        int secret= new Random().nextInt(10)+1;
        for (int i=1; i<=4;i++){
        System.out.println("Please enter a number(" + i +"/4):");
        int number=0;

            number=scanner.nextInt();
            System.out.println("第"+ i + "次" +"猜: " + number);
                if (number > secret) {
                    System.out.println("Lower");

                } else if (number < secret) {
                    System.out.println("Higher");
                } else {
                    System.out.println("Great! the " +
                            "secret number is " + number);
                    break;
                }

               }
        System.out.println("End");
        }
    }

