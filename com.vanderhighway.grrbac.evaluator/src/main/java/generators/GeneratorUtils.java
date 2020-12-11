package generators;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GeneratorUtils {

    public static <T> T getRandom(List<T> list, Random seed) {
        int objectIndex = seed.nextInt(list.size());
        return list.get(objectIndex);
    }

    public static <T> List<T> randomSublist(List<T> list, int n, Random seed) {
        int objectIndex = seed.nextInt(list.size());
        List<T> returnList = new ArrayList<>(list);
        Collections.shuffle(returnList, seed);
        return returnList.subList(0, Math.min(returnList.size(),n));
    }

    public static int toMinutes(String time) {
        return (int) ChronoUnit.MINUTES.between(LocalTime.MIDNIGHT, LocalTime.parse(time));
    }
}
