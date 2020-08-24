class Solution {
    public int countSegments(String s) {
        if(s.length()==0)
            return 0;
        if(s.trim().length()==0)  // If String contains only spaces , then after trimming the length of the string becomes 0
            return 0;
        return s.trim().split("\\s+").length;  //   \\s+   is a regex when the spaces between words are unequal...
    }
}