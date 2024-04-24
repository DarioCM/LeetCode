package org.example.arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class JumpGameII_45Test {

    private JumpGameII_45 jumpGameII_45;

    @BeforeEach
    public void before(){
        jumpGameII_45 = new JumpGameII_45();
    }

    @Test
    void jump() {
        final int[] nums = {2, 3, 1, 1, 4};
        assertEquals(2,jumpGameII_45.jump(nums));
    }

    @Test
    void jump_2() {
        final int[] nums2 = {2, 3, 0, 1, 4};
        assertEquals(2,jumpGameII_45.jump(nums2));
    }
}