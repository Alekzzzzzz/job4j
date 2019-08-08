package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * SqAreaTest
 * @author Alexander Gaponenko (Proton1987@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class SqAreaTest {
    /**
     * Test na ploshad
     */

    @Test

    public  void ploshad() {
        int kvadrat;
        int pryamougolnik;
        kvadrat = SqArea.square(4, 1);
        pryamougolnik = SqArea.square(6, 2);
        System.out.println(kvadrat);
        System.out.println(pryamougolnik);
        assertThat(kvadrat,is(1));
        assertThat(pryamougolnik,is(2));
    }
}
