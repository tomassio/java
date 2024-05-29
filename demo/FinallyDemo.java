package demo;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            @SuppressWarnings("unused")
			int d = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }
    }
}