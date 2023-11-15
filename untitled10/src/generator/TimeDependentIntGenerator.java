package generator;

public class TimeDependentIntGenerator implements IntGenerator {

    @Override
    public int nextPositive() {
        long currentTime = System.currentTimeMillis();
        int P = (int) (Math.random() * 10000);
        if (P < 0){P = 1;}
        return (int) ((currentTime % P  * Integer.MAX_VALUE) / P );
    }

    @Override
    public int nextNegative() {
        return -nextPositive();
    }

    @Override
    public String getName() {
        return "TimeDependentIntGenerator";
    }
}
