public class Main {
    public static void main(String[] args) {
        if (args.length > 1) {
            System.out.println("Usage: ziro [script]");
            System.exit(64);
        } else if (args.length == 1) {
            runFile(args[0]);
        } else {
            runPrompt();
        }
    }

    private static void runFile(String path) {
        System.out.println("Running file: " + path);
    }

    private static void runPrompt() {
        System.out.println("Running prompt");
    }
}