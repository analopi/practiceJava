package generator;

public class RandomIntGenerator implements IntGenerator {
    @Override
    public int nextPositive() {
        return (int) (Math.random() * Integer.MAX_VALUE);
    }

    @Override
    public int nextNegative() {
        return -nextPositive();
    }

    @Override
    public String getName() {
        return "RandomIntGenerator";
    }
}
