// problem link : http://codingbat.com/prob/p108997

public boolean array6(int[] nums, int index) {
  if(nums.length == 0) return false;
  if(index == nums.length) return false;
  return nums[index] == 6 || array6(nums, index + 1);
}
