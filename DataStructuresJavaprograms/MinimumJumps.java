import java.util.ArrayList;
import java.util.Date;

/*Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

Example:

Input: [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2.
    Jump 1 step from index 0 to 1, then 3 steps to the last index.
Note:

You can assume that you can always reach the last index.

*/
class MinimumJumps {
	public int jump(int[] nums) {
		nums[nums.length-1]=0;
		int numsLength = nums.length-1;
		for(int index=nums.length-2;index>=0;index--) {
			int stepsPossible = nums[index];
			if(stepsPossible==0) {
				nums[index]=-1;
				break;
			}
			Integer steps =null;
			for(int i=1; i<=stepsPossible;i++) {
				int newIndex = index+i;
				if(newIndex==numsLength) {
					steps=0;
					break;
				}
				if(newIndex<=nums.length-1 ) {
					int s = nums[newIndex];
			    if(s==-1)continue;
					if(steps==null || s<steps) {
						steps=s;
					}
				}
			}
		    if(steps==null)nums[index]=-1;
		    else nums[index]=steps+1;
		}
		return nums[0];
	    }
    public static void main(String[] args) {
    	MinimumJumps j = new MinimumJumps();
    	int[] nums = {2,3,1,1,4};
//    	int[] nums = new int[25001];
//    	for(int i=0;i<nums.length;i++) {
//    		nums[i]=25000-i;
//    	}
    	System.out.println(new Date());
    	System.out.println(j.jump(nums));
    	System.out.println(new Date());
	}
}
