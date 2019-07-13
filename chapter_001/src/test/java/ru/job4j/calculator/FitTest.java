package ru.job4j.calculator;

        import org.junit.Test;

        import static org.hamcrest.number.IsCloseTo.closeTo;
        import static org.junit.Assert.assertThat;

/**
 * @author Alexander Gaponenko (Proton1987@yandex.ru)
 * @version $Id$
 * since 0.1
 */

public class FitTest {
    /**
     * Test man Weight
     */

    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double weight = fit.manWeight(180);
        System.out.println(weight);
        assertThat(weight, closeTo(92.0, 0.1));
    }

    /**
     * Test woman Weight
     */

    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double weight = fit.womanWeight(170);
        System.out.println(weight);
        assertThat(weight, closeTo(69.0, 0.1));
    }
}