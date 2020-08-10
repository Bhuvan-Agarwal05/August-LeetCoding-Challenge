class Solution {
    public int titleToNumber(String s) {
        
        if(s.length()==1)
            return (int)(s.charAt(0)-'A'+1);
        
        int i,cal=0;
        for(i=0;i<s.length()-1;i++)
        {
            cal += (int)(s.charAt(i)-'A'+1)*Math.pow(26,s.length()-i-1);
        }
        
        cal += (int)(s.charAt(i)-'A'+1);
        
        return cal;
    }
}