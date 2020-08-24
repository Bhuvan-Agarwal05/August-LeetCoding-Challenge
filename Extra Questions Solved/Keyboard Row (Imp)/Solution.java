class Solution {
    public String[] findWords(String[] words) {
        
        HashMap<Integer,ArrayList<Character>> map = new HashMap<>();
        ArrayList<Character> list1 = new ArrayList<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p','Q','W','E','R','T','Y','U','I','O','P'));
        ArrayList<Character> list2 = new ArrayList<>(Arrays.asList('a','s','d','f','g','h','j','k','l','A','S','D','F','G','H','J','K','L'));
        ArrayList<Character> list3 = new ArrayList<>(Arrays.asList('z','x','c','v','b','n','m','Z','X','C','V','B','N','M'));
         
        
        map.put(1,list1);
        map.put(2,list2);
        map.put(3,list3);
        
        ArrayList<String> out = new ArrayList<>();
        int row = 0;
        int flag=1;
        for(String s:words)
        {
            row = 0;
            flag = 1;
            if(list1.contains(s.charAt(0)))
                row = 1;
            else if(list2.contains(s.charAt(0)))
                row = 2;
            else
                row = 3;
            
           
            for(int i=1;i<s.length();i++)
            {
                if(!map.get(row).contains(s.charAt(i)))
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
                out.add(s);
        }
          
        
        String[] output = new String[out.size()];
        for(int i=0;i<out.size();i++)
            output[i] = out.get(i);
        
        return output;
    
    }
}