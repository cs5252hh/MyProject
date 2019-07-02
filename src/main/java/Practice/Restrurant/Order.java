package Practice.Restrurant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Order {

    List<String> salad;
    List<String> meal;
    List<String> drink;


    public  Order(Collection<String> salad,Collection<String> meal,Collection<String> drink){
        this.salad=setSalad();
        this.salad=setMeal();
        this.salad=setDrink();

    }

    public List<String> setSalad() {


        List<String> saladlist
                = new ArrayList<>();
        saladlist.add("salad1");
        saladlist.add("salad2");

        return saladlist;

    }


    public List<String> setMeal() {


        List<String> meallist
                = new ArrayList<>();
        meallist.add("meal1");
        meallist.add("meal2");

        return meallist;

    }

    public List<String> setDrink() {


        List<String> drinklist
                = new ArrayList<>();
        drinklist.add("drink1");
        drinklist.add("drink2");

        return drinklist;

    }



}



