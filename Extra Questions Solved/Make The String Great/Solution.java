class Solution {
    public String makeGood(String s) {
        if(s.length()==0 || s.length()==1)
            return s;
        for(int i=0;i<s.length()-1;)
        {
            if( Math.abs((int)s.charAt(i)-(int)s.charAt(i+1)) == 32 )
            {
                s = s.substring(0,i) + s.substring(i+2,s.length());
                i=0;
            }
            else
                i++;
        }
        
        return s;
    }
}