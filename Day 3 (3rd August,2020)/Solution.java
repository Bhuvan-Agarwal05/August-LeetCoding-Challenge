class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()<=1)
            return true;
        else
        {
        
            StringBuffer str=new StringBuffer("");
             for(int i=0;i<s.length();i++)
             {
                if( (s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='0' && s.charAt(i)<='9') )
                    str.append(s.charAt(i));
             }
            String s1=str.toString();
            String s2=str.reverse().toString();
       
            if(s1.equalsIgnoreCase(s2))
                return true;
            else
                return false;
            
        }
    }
}