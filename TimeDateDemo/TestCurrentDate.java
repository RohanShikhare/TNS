package TimeDateDemo;

import java.time.LocalDate;

public class TestCurrentTime {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);
    }
}
