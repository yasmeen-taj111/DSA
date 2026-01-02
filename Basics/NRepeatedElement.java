// 961. N-Repeated Element in Size 2N Array

// using brute force approach

class Solution {
    public int repeatedNTimes(int[] nums) {
        int len=nums.length;
        int n=len/2;
       for(int i=0;i<len;i++){
        int c=0;
        for(int j=0;j<len;j++){
            if(nums[i]==nums[j]) c++;
            if(c==n) return nums[i];
        }
       }
        return -1; 
     }
}


// using set approach

class Solution {
    public int repeatedNTimes(int[] nums) {
        int len=nums.length;
        int n=len/2;
        Set<Integer> freq=new HashSet<>();
        for(int num:nums){
           if(!freq.add(num)) return num;
        }
        return -1; 
     }
}


// using hashmap approach
class Solution {
    public int repeatedNTimes(int[] nums) {
        int len=nums.length;
        int n=len/2;
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
            if(freq.get(num)==n) return num;
        }
        return -1; 
     }
}
