package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void shouldReturnItemsByName() {
        Tracker tracker = new Tracker();
        String name = "test2";

        Item item1 = new Item(name);
        Item item2 = new Item(name);
        Item item3 = new Item(name);

        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);

        Item[] result = tracker.findByName(name);
        assertEquals(3, result.length);
        assertTrue(name.equals(result[0].getName()) &&
                name.equals(result[1].getName()) &&
                name.equals(result[2].getName()));

    }


    @Test
    public void shouldReturnFindAll() {
        Tracker tracker = new Tracker();
        String name1 = "name1";
        String name2 = "name2";
        String name3 = "name3";

        Item item1 = new Item(name1);
        Item item2 = new Item(name2);
        Item item3 = new Item(name3);

        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);

        Item [] result = tracker.findAll();
        assertEquals(3,result.length);
        assertTrue( name1.equals(result[0].getName()) &&
                              name2.equals(result[1].getName()) &&
                              name3.equals(result[2].getName()));
        assertEquals(item1, result[0]);
        assertEquals(item2, result[1]);
        assertEquals(item3, result[2]);
    }
}