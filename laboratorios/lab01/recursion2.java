public boolean groupNoAdj(int start, int[] nums, int target) {
    if (start >= nums.length) return target == 0;
    return groupNoAdj(start + 2, nums, target - nums[start])
            || groupNoAdj(start + 1, nums, target);
}

public boolean groupSum5(int start, int[] nums, int target) {
    if (start >= nums.length) return target == 0;
    if (nums[start] % 5 == 0) {
        if (start < nums.length - 1 && nums[start + 1] == 1)
            return groupSum5(start + 2, nums, target - nums[start]);
        return groupSum5(start + 1, nums, target - nums[start]);
    }
    return groupSum5(start + 1, nums, target - nums[start])
            || groupSum5(start + 1, nums, target);
}

public boolean splitArray(int[] nums) {
    return helper(0, nums, 0, 0);
}
 
private boolean helper(int start, int[] nums, int sum1, int sum2) {
    if (start >= nums.length) return sum1 == sum2;
    return helper(start + 1, nums, sum1 + nums[start], sum2)
            || helper(start + 1, nums, sum1, sum2 + nums[start]);
}

public boolean splitOdd10(int[] nums) {
    return helper(0, nums, 0, 0);
}
 
private boolean helper(int start, int[] nums, int sum1, int sum2) {
    if (start >= nums.length)
        return sum1 % 10 == 0 && sum2 % 2 == 1 || sum1 % 2 == 1
                && sum2 % 10 == 0;
    return helper(start + 1, nums, sum1 + nums[start], sum2)
            || helper(start + 1, nums, sum1, sum2 + nums[start]);
}

public boolean split53(int[] nums) {
    return helper(0, nums, 0, 0);
}
 
private boolean helper(int start, int[] nums, int sum1, int sum2) {
    if (start >= nums.length) return sum1 == sum2;
    if (nums[start] % 5 == 0)
        return helper(start + 1, nums, sum1 + nums[start], sum2);
    if (nums[start] % 3 == 0)
        return helper(start + 1, nums, sum1, sum2 + nums[start]);
 
    return helper(start + 1, nums, sum1 + nums[start], sum2)
            || helper(start + 1, nums, sum1, sum2 + nums[start]);
}