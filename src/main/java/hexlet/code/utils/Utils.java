package hexlet.code.utils;

public class Utils {
    public static int getNumberToInterval(int start, int end) {
        end -= start;
        return (int) (Math.random() * ++end) + start;
    }
}
