package Exam_to_intro_OOP_ver_4.util;

import java.time.LocalDateTime;

public class ConsoleLogger implements Loggable {
    @Override
    public void log(String message) {
        System.err.println(LocalDateTime.now() + " <--- : ---> " + message);
    }
}
