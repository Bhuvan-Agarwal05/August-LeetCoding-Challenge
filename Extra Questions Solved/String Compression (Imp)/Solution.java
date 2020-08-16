class Solution {
    public int compress(char[] chars) {
        StringBuffer sp = new StringBuffer("");
    
        int count=0;
        for(int i = 0 ; i<chars.length ; i+=count)
        {
            sp.append(chars[i]+"");
            count=1;
            
            for(int j=i+1 ; j<chars.length ; j++)
            {
                if(chars[i]==chars[j])
                    count++;
                else
                    break;
            }
            if(count>1)
                sp.append(""+count);
        }
        for(int i=0;i<sp.length();i++)
            chars[i] = sp.charAt(i);
        
        return sp.length();
    }
}