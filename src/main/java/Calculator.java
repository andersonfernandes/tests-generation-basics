public class Calculator {
    public int sum(int x, int y) {
        return x + y;
    }

    public int sub(int x, int y) {
        return x - y;
    }

    public int div(int x, int y) throws InvalidOperation {
        if (y == 0) throw new InvalidOperation("Cannot div by zero");

        return x / y;
    }

    public int mult(int x, int y) {
        return x * y;
    }
}