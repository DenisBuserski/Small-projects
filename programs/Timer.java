import java.util.*;

public class Timer {
    public static void main(String[] args) {

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int counter = 10;

            @Override
            public void run() {
                if (counter > 0) {
                    System.out.println(counter + " seconds");
                    counter--;
                } else {
                    System.out.println("Happy New Year");
                    timer.cancel();
                }
            }
        };

        // timer.schedule(task, 0); // Second number means after what time will the command happen

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2000);
        // date.set(Calendar.MONTH, Calendar.JUNE);
        date.set(Calendar.MONTH, Calendar.DECEMBER);
        // date.set(Calendar.DAY_OF_MONTH, 20);
        date.set(Calendar.DAY_OF_MONTH, 31);
        // date.set(Calendar.HOUR_OF_DAY, 0);
        date.set(Calendar.HOUR_OF_DAY, 23);
        // date.set(Calendar.MINUTE, 0);
        date.set(Calendar.MINUTE, 59);
        //date.set(Calendar.SECOND, 0);
        date.set(Calendar.SECOND, 50);
        // date.set(Calendar.MILLISECOND, 0);

        // timer.schedule(task, date.getTime()); // The task will be complete when the upper date is ON(Computer date)

        // timer.scheduleAtFixedRate(task, 0, 1000); // Run task every 1 second
        timer.scheduleAtFixedRate(task, date.getTime(), 1000);
        
    }
}
