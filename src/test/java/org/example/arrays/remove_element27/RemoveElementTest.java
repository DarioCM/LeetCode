package org.example.arrays.remove_element27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void removeElement() {
        int nums[] = {0,1,2,2,3,0,4,2};
        int val = 2;
        assertEquals(5,RemoveElement.removeElement(nums, val));
    }


}