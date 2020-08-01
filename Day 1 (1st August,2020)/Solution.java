class Solution {
    public boolean detectCapitalUse(String word) {
        int upper = 0;
        int lower = 0;
        
        for(char c:word.toCharArray())
        {
            if(c>='a' && c<='z')
                lower++;
            else if(c>='A' && c<='Z')
                upper++;
        }
        
        if( (lower==0 && upper==word.length()) || (upper==0 && lower==word.length()) )
            return true;
        else if(upper==1 && lower==word.length()-1)
        {
            if(word.charAt(0)>='A' && word.charAt(0)<='Z')
                return true;
            else
                return false;
        }
        else
            return false;
    }
}