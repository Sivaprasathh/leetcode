class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch = s.toCharArray();
        char[] ch1 = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        String str = "";
        String str1 = "";
        for(char cc:ch)
         str = str+cc;
        
        System.out.println();
        
        for(char ccc:ch1)
         str1 = str1+ccc;
        
       // System.out.print(str + " "+str1);
        return str1.equals(str)?true:false;
    }
}
