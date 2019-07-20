import ru.job4j.condition.Point;
import ru.job4j.condition.Triangle;

public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        point.distance(0,0,0,2);
        double a = Math.pow(0 - 2, 2);
        double b = Math.pow(0 - 0, 2);
        double first = Math.sqrt(a + b);
        System.out.println(first);

    }
}
