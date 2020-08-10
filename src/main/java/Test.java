public class Test {
    // Trainee should comment/uncomment the codes to play around and understand the code flow
    public static void main(String[] args) {
        int result = tryCatchExercise();
        System.out.println(result);
    }

    private static int tryCatchExercise() {
        try {
            doSomething();
            return 0;
        } catch (RuntimeException e) {
            return 1;
        } catch (IllegalArgumentException | NullPointerException e) {
            // throw new RuntimeException("What will happen? What is missing here?");
            return 2;
        } finally {
            // throw new IllegalArgumentException("What is missing here?");
            return 3;
        }
    }

    private static void doSomething() {
        // throw new Exception("This is an exception, this exception should always be presented in all stack trace");
        // throw new NullPointerException("This is an exception, this exception should always be presented in all stack trace");
    }
}
