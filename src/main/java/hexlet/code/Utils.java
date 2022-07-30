package hexlet.code;

public class Utils {
    public static int getNumberToInterval(int start, int end) {
        end -= start;
        return (int) (Math.random() * ++end) + start;
    }
}
