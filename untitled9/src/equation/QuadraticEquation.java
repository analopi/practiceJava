package equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isQuadratic() {
        return a != 0;
    }

    @Override
    public String toString() {
        StringBuilder equationString = new StringBuilder();

        if (a != 0) {
            equationString.append(a).append("x^2");
        }

        if (b != 0) {
            equationString.append((b > 0) ? " + " : " - ").append(Math.abs(b)).append("x");
        }

        if (c != 0) {
            equationString.append((c > 0) ? " + " : " - ").append(Math.abs(c));
        }
        if (a == 0 && b == 0 && c == 0) {
            equationString.append("0");
        }
        equationString.append(" = 0");

        return equationString.toString();
    }
}
