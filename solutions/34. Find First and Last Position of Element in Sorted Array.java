class Solution {
    public int[] searchRange(int[] nums, int target) {
      
        int ind = 0,count = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i<nums.length ;i++){
            if(nums[i] == target){
               // arr[ind++] = i;
                list.add(i);
                count++;
            }
        }
              int[] arr = new int[2];
      if(count == 0){
          list.add(-1);
          list.add(-1);
      }
      else if(count == 1){
          int num = list.get(0);
          list.add(num);
      }  
      Collections.sort(list);
​
      arr[0] = list.get(0);
      arr[1] = list.get(list.size()-1);
      
      return arr;
    }
}
