package errors;

public class ErrorHandler {
    private static boolean hadError = false;

    public static void error(int line, String message) {
        report(line, "", message);
    }

    private static void report(int line, String where, String message) {
        System.err.println("[line " + line + "] Error" + where + ": " + message);
        hadError = true;
    }

    public static boolean hadError() {
        return hadError;
    }
}
