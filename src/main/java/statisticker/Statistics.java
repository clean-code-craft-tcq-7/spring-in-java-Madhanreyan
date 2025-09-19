package statisticker;

import java.util.List;

public class Statistics 
{
    public static Stats getStatistics(List<Float> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return new Stats(Float.NaN, Float.NaN, Float.NaN);
        }
        float min = Float.MAX_VALUE;
        float max = -Float.MAX_VALUE;
        double sum = 0.0; // use double for accumulation precision
        int count = 0;
        for (Float f : numbers) {
            if (f == null) {
                continue; // skip null entries silently
            }
            if (f < min) {
                min = f;
            }
            if (f > max) {
                max = f;
            }
            sum += f;
            count++;
        }
        if (count == 0) { // all nulls
            return new Stats(Float.NaN, Float.NaN, Float.NaN);
        }
        float average = (float)(sum / count);
        return new Stats(average, min, max);
    }
}
