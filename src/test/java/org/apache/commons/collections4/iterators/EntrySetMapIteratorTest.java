package org.apache.commons.collections4.iterators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class EntrySetMapIteratorTest {

    /**
     * This method tests if the next() method is giving the next element in the list or not
     */
    @Test
    public void testNext() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("test1", "test1");
        map.put("test2", "test2");
        EntrySetMapIterator<String, String> entrySetMapIterator = new EntrySetMapIterator<>(map);
        Assertions.assertEquals("test1", entrySetMapIterator.next());
        Assertions.assertEquals("test2", entrySetMapIterator.next());
    }
}
