package other_thing.study;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Date_ {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(newDate.outPut());

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(newDate.outPut());
        System.out.println(newDate.outPutOriginal());
    }
}

class newDate {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 ahh:mm:ss");
    private static Date date;
    public static String outPut() {
        return sdf.format(date = new Date());
    }
    public static String outPutOriginal() {
        return date.toString();
    }
}
