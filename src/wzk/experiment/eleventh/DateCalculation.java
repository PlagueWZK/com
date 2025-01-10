package wzk.experiment.eleven;

/**
 * @author PlagueWZK
 * description: A
 * date: 2025/1/2 20:25
 */

import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCalculation {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.DAY_OF_YEAR, 100);

        Date dateAfter100Days = calendar.getTime();

        DateFormat dateFormat = new SimpleDateFormat("yyyy年M月d日");
        String formattedDate = dateFormat.format(dateAfter100Days);

        System.out.println("100天后的日期是：" + formattedDate);
    }
}
