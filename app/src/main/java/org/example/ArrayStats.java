package org.example;

import java.util.Arrays;

public class ArrayStats {

    // loop versions
    public int minimumUsingForLoop(int[] nums) {
        int min = nums[0];
        for (int n : nums) {
            if (n < min) min = n;
        }
        return min;
    }

    public int maximumUsingForLoop(int[] nums) {
        int max = nums[0];
        for (int n : nums) {
            if (n > max) max = n;
        }
        return max;
    }

    public int sumUsingForLoop(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum;
    }

    public int averageUsingForLoop(int[] nums) {
        return sumUsingForLoop(nums) / nums.length;
    }

    // Stream versions
    public int minimumUsingStream(int[] nums) {
        return Arrays.stream(nums).min().orElseThrow();
    }

    public int maximumUsingStream(int[] nums) {
        return Arrays.stream(nums).max().orElseThrow();
    }

    public int sumUsingStream(int[] nums) {
        return Arrays.stream(nums).sum();
    }

    public int averageUsingStream(int[] nums) {
        return (int) Arrays.stream(nums).average().orElseThrow();
    }
}