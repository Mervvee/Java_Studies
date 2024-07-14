import java.util.*;
import java.lang.*;
public class ShowCurrentTime {
    public static void main(String [] args){
        long totalSecond = System.currentTimeMillis();

        long currentSecond = totalSecond % 60;

        long totalMinutes = totalSecond / 60 ;
        long currentMinutes = totalMinutes % 60 ;

        long totalHours = totalMinutes / 60 ;
        long currentHours = totalHours % 24 ;

        System.out.println("Current time is " + currentHours + " hr " + currentMinutes + " min " + currentSecond + " sec => so " + currentHours + ":" + currentMinutes + ":" + currentSecond + " GMT.");
    }
}