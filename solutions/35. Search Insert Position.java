class Solution {
    public int searchInsert(int[] nums, int target) {
          int ind = -1;
          List<Integer> list = new ArrayList<>();
          for(int i:nums){
              list.add(i);
          }
          list.add(target);
          Collections.sort(list);
          for(int i = 0 ; i < list.size() ;i++){
              if(list.get(i) == target){
                  return i;
              }
          }
        return ind;
      }
        
    }
​
