class Solution {
    public String toHex(int num) {
        if(num>=0 && num<=9)
            return num+"";
        else if(num>=10 && num<=15)
            return (char)(num+87)+"";
        else 
        {
            
            StringBuffer s = new StringBuffer(Integer.toBinaryString(num));
            StringBuffer str=new StringBuffer("");
            
            for(int i=s.length()-1;i>=0;i-=4)
            {
                String temp = s.toString().substring(Math.max(0,i-3),i+1);
                if(temp.equals("1010"))
                    str.append("a");
                else if(temp.equals("1011"))
                    str.append("b");
                else if(temp.equals("1100"))
                    str.append("c");
                else if(temp.equals("1101"))
                    str.append("d");
                else if(temp.equals("1110"))
                    str.append("e");
                else if(temp.equals("1111"))
                    str.append("f");
                else 
                    str.append(Integer.parseInt(temp,2)+"");
            }
            
            return str.reverse().toString();
        }
    }
}