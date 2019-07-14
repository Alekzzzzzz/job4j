package ru.job4j.condition;

/**
 * SqArea
 * @author Alexander Gaponenko (Proton1987@mail.ru)
 *
 */
public class SqArea {

    public static int square(int p, int k) {
        int w, h, s;
        h = p / 2 / k - k;
        w = h * k;
        s = w * h;
        return s;
    }
}