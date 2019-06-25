package Parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter =
            LocalDateTime.of(2019,6,10,8,8,8);

        LocalDateTime leave =
                LocalDateTime.of(2019,6,10,8,15,8);

        Car car = new Car("AAAA",enter);
        car.setLeave(leave);
        System.out.println(car.getDuration());
        long hour = (long) Math.ceil(car.getDuration()/60.0);
        System.out.println(hour);




    }

    private static void DateTime() {
        Date date= new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(sdf.format(date));
        String s= "2019/05/21";
        try {
            Date ohterdate= sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
