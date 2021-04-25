package date_time;

import lombok.SneakyThrows;
import java.time.temporal.ChronoUnit;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateHandler {
    @SneakyThrows
    public long dayDiff(String firstDate, String secondDate){

        LocalDate date1 = LocalDate.parse(firstDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate date2 = LocalDate.parse(secondDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        return ChronoUnit.DAYS.between(date1,date2);
    }

    public LocalDate changeFormat(String date){
        LocalDate newDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-dd-MM"));
        return LocalDate.parse(newDate.toString(),DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }


}
