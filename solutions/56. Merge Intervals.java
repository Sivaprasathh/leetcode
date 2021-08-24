class Solution {
    public int[][] merge(int[][] intervals) {
        int[] st = new int[intervals.length];
        int[] e = new int[intervals.length];
        for(int i = 0 ; i < intervals.length ; i++){
            st[i] = intervals[i][0];
            e[i] = intervals[i][1];
        }
        List<int[]> list = new LinkedList<>();
        Arrays.sort(st);
        Arrays.sort(e);
        int ind = 0;
        for(int i = 0 ; i < st.length-1 ;i++){
            if(st[i+1] > e[i]){
                list.add(new int[] {st[ind],e[i]});
                    ind = i+1;
            }
        }
        list.add(new int[] {st[ind], e[intervals.length - 1]}); 
​
        return list.toArray(new int[list.size()][]);
    }
}
