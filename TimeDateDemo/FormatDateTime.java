package TimeDateDemo;

import java.time.LocalDateTime;

public class FormatDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        // before formatting
        System.out.println("Before formatting: " + now);
        //after formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
    }
}
