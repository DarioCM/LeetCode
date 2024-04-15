package org.example.arrays;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateArray_189Test {

    private RotateArray_189 rotateArray_189;

    @BeforeEach
    public void before(){
        rotateArray_189 = new RotateArray_189();
    }


    @Test
    void rotate() {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int[] expected = {5,6,7,1,2,3,4};
        rotateArray_189.rotate(nums,k);
        assertArrayEquals(expected,nums);
    }

    @Test
    void rotate_2() {
        int[] nums = {-1,-100,3,99};
        int k = 2;
        int[] expected = {3,99,-1,-100};
        rotateArray_189.rotate(nums,k);
        assertArrayEquals(expected,nums);
    }


}