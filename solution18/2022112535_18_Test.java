package solution18;

import org.junit.Assert;
import org.junit.Test;

public class 2022112535_18_Test {

    @Test
    public void testProductExceptSelf_NormalInput() {
        Solution sol = new Solution();
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        Assert.assertArrayEquals(expected, sol.productExceptSelf(nums));
    }

    @Test
    public void testProductExceptSelf_WithZero() {
        Solution sol = new Solution();
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        Assert.assertArrayEquals(expected, sol.productExceptSelf(nums));
    }

    @Test
    public void testProductExceptSelf_AllPositive() {
        Solution sol = new Solution();
        int[] nums = {2, 3, 4, 5};
        int[] expected = {60, 40, 30, 24};
        Assert.assertArrayEquals(expected, sol.productExceptSelf(nums));
    }

    @Test
    public void testProductExceptSelf_AllNegative() {
        Solution sol = new Solution();
        int[] nums = {-1, -2, -3, -4};
        int[] expected = {-24, -12, -8, -6};
        Assert.assertArrayEquals(expected, sol.productExceptSelf(nums));
    }

    @Test
    public void testProductExceptSelf_MultipleZeros() {
        Solution sol = new Solution();
        int[] nums = {0, 1, 2, 0, 3};
        int[] expected = {0, 0, 0, 0, 0};
        Assert.assertArrayEquals(expected, sol.productExceptSelf(nums));
    }

    @Test
    public void testProductExceptSelf_SingleElement() {
        Solution sol = new Solution();
        int[] nums = {10};
        int[] expected = {1};
        Assert.assertArrayEquals(expected, sol.productExceptSelf(nums));
    }

    @Test
    public void testProductExceptSelf_TwoElements() {
        Solution sol = new Solution();
        int[] nums = {3, 4};
        int[] expected = {4, 3};
        Assert.assertArrayEquals(expected, sol.productExceptSelf(nums));
    }

    @Test
    public void testProductExceptSelf_SmallerLargeNumbers() {
        Solution sol = new Solution();
        int[] nums = {1000, 100, 10, 5, 2};
        int[] expected = {10000, 100000, 1000000, 2000000, 5000000};
        Assert.assertArrayEquals(expected, sol.productExceptSelf(nums));
    }
}