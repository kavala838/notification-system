package utils;

// DRY: Logging is centralized here rather than scattered.
// KISS: Simple logging mechanism.
public class Logger {
    public static void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
