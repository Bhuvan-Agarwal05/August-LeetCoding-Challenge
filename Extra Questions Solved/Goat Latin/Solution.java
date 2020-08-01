class Solution {
    public String toGoatLatin(String S) {
        String[] str = S.split(" ");
        StringBuffer sp = new StringBuffer("");
        int j=0;
        for(int i=0;i<str.length;i++)
        {
            if(str[i].charAt(0)=='a'||str[i].charAt(0)=='e'||str[i].charAt(0)=='i'||str[i].charAt(0)=='o'||str[i].charAt(0)=='u')
                sp.append(str[i]+"ma");
            else if(str[i].charAt(0)=='A' || str[i].charAt(0)=='E' || str[i].charAt(0)=='I' || str[i].charAt(0)=='O' || str[i].charAt(0)=='U')
                sp.append(str[i]+"ma");
            else
                sp.append(str[i].substring(1,str[i].length()) + str[i].charAt(0) + "ma");
               
            j=0;
            while(j<i+1)
             {
                 sp.append("a");
                 j++;
             }
            str[i] = sp.toString();
            sp.delete(0,sp.length());
        }
               
    StringBuffer stemp = new StringBuffer("");
               for(j=0;j<str.length-1;j++)
                stemp.append(str[j]+" ");
              
               stemp.append(str[j]);
               
    return stemp.toString();
    }
}