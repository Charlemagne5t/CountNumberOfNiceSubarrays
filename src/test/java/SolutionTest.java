import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[] nums = { 1,1,2,1,1};
        int k = 3;
        int expected = 2;
        int actual = new Solution().numberOfSubarrays(nums, k);

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void test2() {
        int[] nums = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        int expected = 16;
        int actual = new Solution().numberOfSubarrays(nums, k);

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void test3() {
        int[] nums = {91473,45388,24720,35841,29648,77363,86290,58032,53752,87188,34428,85343,19801,73201};
        int k = 4;
        int expected = 6;
        int actual = new Solution().numberOfSubarrays(nums, k);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test4() {
        int[] nums = {1,1,0,0,1,0,1,1,1,0,1,0,0,0,1,1};
        int k = 1;
        int expected = 28;
        int actual = new Solution().numberOfSubarrays(nums, k);

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void test5() {
        int[] nums = {0,1,1};
        int k = 1;
        int expected = 3;
        int actual = new Solution().numberOfSubarrays(nums, k);

        Assert.assertEquals(expected, actual);

    }

}
