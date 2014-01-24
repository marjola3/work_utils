package srednia;

/**
 * User: Mariola
 * Date: 24.01.14
 */
public class AvgMinMax {
    public double min(double[] numbers) throws NullArgumentException, EmptyArrayException {
        if (numbers == null){
            throw new NullArgumentException("null Array");
        }
        if (numbers.length == 0) {
            throw new EmptyArrayException("empty Array");
        }

        double min = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }

    public double max(double[] numbers) {
        return 0;
    }

    public double avg(double[] numbers) {
        return 0;
    }

}
