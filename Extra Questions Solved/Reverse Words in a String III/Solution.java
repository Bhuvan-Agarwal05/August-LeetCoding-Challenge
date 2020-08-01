class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuffer ans = new StringBuffer("");
        
        for(int i=0;i<str.length;i++)
        {
            ans.append(reverse(str[i]));
            if(i!=str.length-1)
                ans.append(" ");
        }
        
        return ans.toString();    
    }
    
    private String reverse(String s)
    {
        StringBuffer sp = new StringBuffer("");
        for(int i=s.length()-1;i>=0;i--)
            sp.append(s.charAt(i));
        
        return sp.toString();
    }
}