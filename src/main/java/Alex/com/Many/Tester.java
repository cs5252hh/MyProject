package Alex.com.Many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Tester {
    public static void main(String[] args) {



        // Set 沒有排序的概念，沒有索引的概念
        // Set();

        // List();
        // List是一個集合家族的最上層，底下有ArrayList
        // 可放入重複資料，具有索引概念，有次序的概念


       /* int [] number=new int[5];

        for (int i=0; i<5; i++){
            int[] score={70,50,65,50,67};
            System.out.println(score[i]);

        }*/




    }

    private static void Set() {
        HashSet<Integer> set = new HashSet<>();
        set.add(7);
        set.add(4);
        set.add(2);
        set.add(1);
        set.add(3);

        for (int n : set) {
            System.out.println(n);

        }
    }

    private static void List() {
        ArrayList<Integer> score= new ArrayList();
        score.add(30);
        score.add(40);





        List <Integer> number
                = Arrays.asList(70,50,65,50,67,50);
        int n1= number.get(0);

        for (int scores:number){
            System.out.println(scores);

        }
    }


}
