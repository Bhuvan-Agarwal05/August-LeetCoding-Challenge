class Solution {
    public String thousandSeparator(int n) {
        String s = Integer.toString(n);
        if(s.length()<=3)
            return s;
        else
        {
            StringBuffer sp = new StringBuffer(s);
            sp = sp.reverse();
            StringBuffer output = new StringBuffer("");
           for(int i = 0;i<sp.length();i+=3)
           {
                output.append(sp.toString().substring(i,Math.min(sp.length(),i+3)));
               if(i+3<sp.length())
                    output.append(".");
           }
          
          return output.reverse().toString();  
        }
    }
}