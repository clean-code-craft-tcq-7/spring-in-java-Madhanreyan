package statisticker;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Float> data = Arrays.asList(1.5f, 8.9f, 3.2f, 4.5f);
        Stats stats = Statistics.getStatistics(data);
        System.out.println("Average: " + stats.average);
        System.out.println("Min: " + stats.min);
        System.out.println("Max: " + stats.max);
    }
}
