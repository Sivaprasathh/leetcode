class Solution {
    public boolean isPalindrome(String s) {
        int l = s.length();
        char ch;
        String rev="";
        String rev_check="";
        s = s.toLowerCase(); /* The original String is converted to lowercase to simplify our problem else we will have to check cases manually while adding characters */
        for(int i=0; i<l; ++i)
        {
            ch = s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9')) // Add Character to new string only if it is an alphabet or a number
            {
                rev = ch + rev; // Creating reversed string without alphanumeric characters
                rev_check = rev_check + ch; // Creating new non reversed string without alphanumeric characters
            }
        }
        return rev.equals(rev_check); // Checking if both are equal or not
​
    }
}
