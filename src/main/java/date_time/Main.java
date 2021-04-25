package date_time;

public class Main {
    public static void main(String[] args) {
        DateHandler dateHandler = new DateHandler();
        System.out.println(dateHandler.dayDiff("2022-01-20","2022-02-23"));
        System.out.println(dateHandler.changeFormat("2022-10-01"));
    }
}
