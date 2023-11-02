package org.apache.commons.collections4.iterators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class EntrySetMapIteratorTest {
    EntrySetMapIterator<String, String> entrySetMapIterator;

    /**
     * Initialize the EntrySetMapIterator with two entries in a LinkedHashMap
     */
    @BeforeEach
    public void init() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("test1", "test1");
        map.put("test2", "test2");
        entrySetMapIterator = new EntrySetMapIterator<>(map);
    }

    /**
     * This method tests if the next() method is giving the next element in the list or not.
     */
    @Test
    public void testNext() {
        Assertions.assertEquals("test1", entrySetMapIterator.next());
    }

    /**
     * This method tests the getKey() method which give the key of the current key-value pair in the map.
     */
    @Test
    public void testGetKey() {
        entrySetMapIterator.next();
        Assertions.assertEquals(entrySetMapIterator.getKey(), "test1");
    }

    /**
     * This method tests the getValue() method which give the value of the current key-value pair in the map.
     */
    @Test
    public void testGetValue() {
        entrySetMapIterator.next();
        Assertions.assertEquals(entrySetMapIterator.getValue(), "test1");
    }

    /**
     * This method tests the hasNext() method which tells whether there are any key-value pair in the map or not.
     */
    @Test
    public void testHasNext() {
        Assertions.assertTrue(entrySetMapIterator.hasNext());
    }
}
