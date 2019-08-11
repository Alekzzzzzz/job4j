package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MortgageTest {
    @Test
    public void when1Year(){
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(1000,50,70);
        assertThat(year,is(2));
    }
    public void when2Year(){
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(100,10,50);
        assertThat(year,is(2));
    }
}
