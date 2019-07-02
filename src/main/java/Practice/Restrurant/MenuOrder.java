package Practice.Restrurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuOrder {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Menu order = new Menu(null,null,null);
        System.out.println("Welcome !");
        System.out.println("Here are salad:");
        System.out.println(order.setSalad());
        System.out.println("Please enter number to order salad:");
        int saladinput = scanner.nextInt()-1;
        String selfsalad= (order.setSalad().get(saladinput));

        System.out.println("Here are meal:");
        System.out.println(order.setMeal());
        System.out.println("Please enter number to order meal:");
        int mealinput = scanner.nextInt()-1;
        String selfmeal= (order.setMeal().get(mealinput));

        System.out.println("Here are drink:");
        System.out.println(order.setDrink());
        System.out.println("Please enter number to order drink:");
        int drinkinput = scanner.nextInt()-1;
        String selfdrink= (order.setDrink().get(drinkinput));

        System.out.print("Your order are:"+ "\t" + selfsalad+ "\t"+ selfmeal
                + "\t" + selfdrink);
    }
}
