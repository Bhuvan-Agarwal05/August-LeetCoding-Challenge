class Solution {
    public boolean isLongPressedName(String name, String typed) {
        
        // If Typed Name is smaller in length than the actual Name
        if(name.length() > typed.length())
            return false;
        // If Actual Name == Typed Name
        else if(name.equals(typed))
            return true;
        // If First and Last Characters of Actual Name & Typed Name is not same then return false
        else if( name.charAt(0) != typed.charAt(0) || name.charAt(name.length()-1) != typed.charAt(typed.length()-1) )
            return false;
        else
        {
            boolean flag = true;
            int count = 1;
            int typedLow = 0;
            int countTyped = 0;
            
            
            for(int i=0;i<name.length();i+=count)
            {
                count = 1;
                countTyped = 0;
                for(int j=i+1;j<name.length();j++)
                {
                    if(name.charAt(i)==name.charAt(j))
                        count++;
                    else
                        break;
                }
                
                while(typedLow<typed.length() && typed.charAt(typedLow)==name.charAt(i))
                {
                    countTyped++;
                    typedLow++;
                }
                
                if(count > countTyped)
                    return false; 
            }
            
            return true;
        }
        
    }
}