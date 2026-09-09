package TimeDateDemo;

import java.time.LocalTime;

public class TestCurrentTime {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);
    }
}
