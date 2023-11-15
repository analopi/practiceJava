package generator;

public class SerialIntGenerator implements IntGenerator{
    private static int counter = 0;

    @Override
    public int nextPositive() {
        counter++;
        return counter;
    }

    @Override
    public int nextNegative() {
        return -nextPositive();
    }

    @Override
    public String getName() {
        return "SerialIntGenerator";
    }
}
