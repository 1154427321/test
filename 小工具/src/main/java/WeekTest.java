import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.Week;

public class WeekTest {

    public static void main(String[] args) {
        Week week = DateUtil.thisDayOfWeekEnum();
        System.out.println(week);

    }
}
