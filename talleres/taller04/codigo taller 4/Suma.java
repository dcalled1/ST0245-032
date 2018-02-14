/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David´s PC
 */
public class Suma {
    public Suma() {}
    
    public boolean groupSum(int start,int[] nums,int target) {
        if(start>=nums.length) return target==0;
        return groupSum(start+1,nums,target-nums[start]) || groupSum(start+1,nums,target);
    }
}
